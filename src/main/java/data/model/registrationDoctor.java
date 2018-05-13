package data.model;

public class registrationDoctor {

    private String doctorId;
   private  String doctorName;
   private String specialist ;
   private  String phoneNumber;
   private  String checkUpDate;
   private String  password;


    public registrationDoctor() {
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCheckUpDate() {
        return checkUpDate;
    }

    public void setCheckUpDate(String checkUpDate) {
        this.checkUpDate = checkUpDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
