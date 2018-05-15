package controller;

import data.model.Admin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "adminbean")
@SessionScoped
public class AdminCon {
Admin ad=new Admin();
public String goHome(){ return "home";}



}

