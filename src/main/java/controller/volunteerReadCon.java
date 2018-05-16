package controller;

import data.model.volunteer;

import javax.faces.bean.ManagedBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
@ManagedBean(name = "rv")

public class volunteerReadCon {
    public ArrayList<volunteer> getVolunteer(){
        ArrayList<volunteer>records=new ArrayList<>();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Refugee","oracle_1");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select* from donation");
            while(rs.next())
            {
                volunteer stu =new volunteer();
                stu.setDonation_type(rs.getString(1));
                stu.setDistributor_id(rs.getString(2));
                stu.setDonation_date(rs.getString(3));
                stu.setDonor_type(rs.getString( 4));


                records.add(stu);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return records;
    }

    public String isNextPage(){
        return "volunteer"; //same name as next page
    }

}



