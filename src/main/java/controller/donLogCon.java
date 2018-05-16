package controller;

import data.model.donLog;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@ManagedBean(name = "donorLogbean")
@SessionScoped
public class donLogCon {
    public donLogCon() {
    }
    donLog donor=new donLog();

    public donLog getDonor() {
        return donor;
    }

    public void setDonor(donLog donor) {
        this.donor = donor;
    }

    public String donsignin(){
        int p=0;
        try{
            String username=donor.getDusername();
            String password=donor.getDpassword();
            System.out.println(username);
            System.out.println(password);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ict","Oracle_1");
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from login");
            while(rs.next())
            {
                System.out.println("between");System.out.println("between");
                String user=rs.getString("username");
                String pass=rs.getString("password");
                System.out.println(user);
                System.out.println(pass);
                if(username.equals(user) && password.equals(pass))
                {
                    p=1;
                    FacesContext facesContext = FacesContext.getCurrentInstance();
                    HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
                    session.setAttribute("c_username",user);
                    session.setAttribute("c_password",pass);
                    donor.setDstatus("Login Successful.....welcome");

                    return "donor";
                }
            }
            if(p!=1)
            {
                donor.setDstatus("username or password is invalid");
                return "donlog";

            }


        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }




}
