package controller;


import data.model.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@ManagedBean(name = "r")
@SessionScoped

public class loginCon {
    public loginCon() {
    }
    login log=new login();

    public login getLog() {
        return log;
    }

    public void setLog(login log) {
        this.log = log;
    }

    public String signin(){
        int p=0;
        try{
            String username=log.getClient_username();
            String password=log.getPassword();
            System.out.println(username);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ict","Oracle_1");
            Statement st=con.createStatement();
            System.out.println("asdasda");
            ResultSet rs=st.executeQuery("select gender,block from camp");
            while(rs.next())
            {

                String user=rs.getString("gender");
                String pass=rs.getString("block");
                System.out.println(user);
                System.out.println(pass);
                if(username.equals(user) && password.equals(pass))
                {
                    p=1;
                    FacesContext facesContext = FacesContext.getCurrentInstance();
                    HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
                    session.setAttribute("c_username",user);
                    session.setAttribute("c_password",pass);
                   log.setStatus("Login Successful.....Hello");

                    return "success";
                }
            }
            if(p!=1)
            {
                log.setStatus("username or password is invalid");
                return "index";

            }


        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

            }








