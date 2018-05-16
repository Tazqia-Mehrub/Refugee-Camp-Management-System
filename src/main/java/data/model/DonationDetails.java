package data.model;

import java.sql.Date;

public class DonationDetails {
    private String donation_type;
    private String donor_type;
   private  int distributor_id;
   private Date donation_date;

    public DonationDetails() {
    }

    public String getDonation_type() {
        return donation_type;
    }

    public void setDonation_type(String donation_type) {
        this.donation_type = donation_type;
    }

    public String getDonor_type() {
        return donor_type;
    }

    public void setDonor_type(String donor_type) {
        this.donor_type = donor_type;
    }

    public int getDistributor_id() {
        return distributor_id;
    }

    public void setDistributor_id(int distributor_id) {
        this.distributor_id = distributor_id;
    }

    public Date getDonation_date() {
        return donation_date;
    }

    public void setDonation_date(Date donation_date) {
        this.donation_date = donation_date;
    }
}
