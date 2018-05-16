package controller;

import data.model.volLog;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@ManagedBean(name = "volLogbean")
@SessionScoped
public class volLogCon{
    public volLogCon() {
    }

    volLog vollog = new volLog();

    public volLog getVollog() {
        return vollog;
    }

    public void setVollog(volLog vollog) {
        this.vollog = vollog;
    }

    public String volsignin(){
        int p=0;
        try{
            String username=vollog.getAusername();
            String password=vollog.getApassword();
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
                    vollog.setVolstatus("Login Successful.....welcome");

                    return "volunteerRead";
                }
            }
            if(p!=1)
            {
                vollog.setVolstatus("username or password is invalid");
                return "index";

            }


        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}