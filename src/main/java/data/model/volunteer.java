package data.model;

public class volunteer {
    private String Donation_type ;
    private String Donor_type ;
    private String Distributor_id;
    private String Donation_date;

    public volunteer() {
    }

    public String getDonation_type() {
        return Donation_type;
    }

    public void setDonation_type(String donation_type) {
        Donation_type = donation_type;
    }

    public String getDonor_type() {
        return Donor_type;
    }

    public void setDonor_type(String donor_type) {
        Donor_type = donor_type;
    }

    public String getDistributor_id() {
        return Distributor_id;
    }

    public void setDistributor_id(String distributor_id) {
        Distributor_id = distributor_id;
    }

    public String getDonation_date() {
        return Donation_date;
    }

    public void setDonation_date(String donation_date) {
        Donation_date = donation_date;
    }
}
