package controller;

import data.model.donorjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "d")
@SessionScoped

public class donorCon {

    public donorCon() {
    }
    donorjsf don=new donorjsf();
    public String logout(){
        return "home";
    };
}

