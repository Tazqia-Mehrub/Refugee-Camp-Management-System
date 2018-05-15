package data.model;

public class rInfo {
private int serialNo;
private String Refugee_name;
private String gender;
private int age;
private String block;
private String volunteerName;
private String volunteerOf;
private int volunteerId;

    public rInfo() {
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerOf() {
        return volunteerOf;
    }

    public void setVolunteerOf(String volunteerOf) {
        this.volunteerOf = volunteerOf;
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getRefugee_name() {
        return Refugee_name;
    }

    public void setRefugee_name(String refugee_name) {
        Refugee_name = refugee_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
