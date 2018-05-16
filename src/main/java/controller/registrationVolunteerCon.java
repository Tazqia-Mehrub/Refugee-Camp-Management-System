package controller;

import data.model.registrationVolunteer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@ManagedBean(name = "regbean")
@SessionScoped
public class registrationVolunteerCon {
    public registrationVolunteerCon() {
    }
registrationVolunteer regV=new registrationVolunteer();

    public registrationVolunteer getRegV() {
        return regV;
    }

    public void setRegV(registrationVolunteer regV) {
        this.regV = regV;
    }

    public  String registration(){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ict", "Oracle_1");
            Statement st = con.createStatement();
            String name = regV.getVolunteerName();

            int id = regV.getVolunteerId();
            String type = regV.getVolunteerType();


            String a = "insert into distribution(column1,distributor_name,column3) values('" + id + "','" + name + "','" + type + "')";
            st.executeUpdate(a);
            regV.setStatus("Registration Successful");
            return "registration";
        } catch (Exception var15) {
            regV.setStatus("Failed");
            return "registration";
        }



    }
public String goReg(){return "registration_volunteer";}

}
