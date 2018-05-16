package data.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


public class doctor {

    private String DoctorName;
    private String specialist ;

    public doctor() {
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
