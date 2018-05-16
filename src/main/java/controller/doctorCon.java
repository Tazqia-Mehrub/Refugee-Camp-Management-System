package controller;

import data.model.doctor;


import javax.faces.bean.ManagedBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@ManagedBean(name = "rrr")

public class doctorCon {

    public ArrayList<doctor>getDoctor(){
        ArrayList<doctor>records=new ArrayList<>();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Refugee","oracle_1");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select* from doctor");
            while(rs.next())
            {
                doctor stud=new doctor();
                stud.setDoctorName(rs.getString(1));
                stud.setSpecialist(rs.getString(2));
                records.add(stud);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return records;
    }

    public String isNextPage(){
        return "doctor"; //same name as next page
    }
}
