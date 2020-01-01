package main;

public class ContactModel {
    
    private String address;
    private String emailID;
    private String Name;
    private String[] numbers;
    private String website;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers.split(",");
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    
}
