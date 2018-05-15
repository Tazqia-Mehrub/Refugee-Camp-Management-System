package controller;

import data.model.rInfo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
@ManagedBean(name = "retrievebean")
@SessionScoped
public class rInfoCon {
    public rInfoCon() {
    }



        public ArrayList<rInfo>getVolunteerInfo(){
            ArrayList<rInfo>records=new ArrayList<>();
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ict","Oracle_1");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from distribution");
                while(rs.next())
                {
                    rInfo info = new rInfo();
                    info.setVolunteerId(rs.getInt(1));
                    info.setVolunteerName(rs.getString(2));
                    info.setVolunteerOf(rs.getString(3));
                    records.add(info);
                }

            }
            catch (Exception e){
                System.out.println(e);
            }
            return records;
        }



    public String retrieveValue(){
        return "rinfo";
    }







}