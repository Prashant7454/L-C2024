package Customer;

public class Customer {
    private int customerID;
    private String company;
    private String contact;
    private String country;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", companyName='" + company + '\'' +
                ", contactName='" + contact + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
