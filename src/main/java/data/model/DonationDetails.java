package data.model;

public class DonationDetails {
    private String donation_type;
    private String donation_date;
    private String donor_date;

    public String getDonation_type() {
        return donation_type;
    }

    public void setDonation_type(String donation_type) {
        this.donation_type = donation_type;
    }

    public String getDonation_date() {
        return donation_date;
    }

    public void setDonation_date(String donation_date) {
        this.donation_date = donation_date;
    }

    public String getDonor_date() {
        return donor_date;
    }

    public void setDonor_date(String donor_date) {
        this.donor_date = donor_date;
    }
}
