package data.model;

public class volLog {
    private String ausername;
    private String apassword;
    private  String volstatus;

    public volLog() {
    }

    public volLog(String ausername, String apassword) {
        this.ausername = ausername;
        this.apassword = apassword;
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getVolstatus() {
        return volstatus;
    }

    public void setVolstatus(String volstatus) {
        this.volstatus = volstatus;
    }
}
