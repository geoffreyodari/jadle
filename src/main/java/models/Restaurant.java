package models;

public class Restaurant {
    private String name;
    private String address;
    private String zipcode;
    private String phone;
    private String website;
    private String email;
    private int id;

    public Restaurant(String name, String address, String zipcode, String phone) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.phone = phone;
        this.website = "no website listed";
        this.email = "no email available";
    }

    public Restaurant(String name, String address, String zipcode, String phone, String website, String email) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.phone = phone;
        this.website = website;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getZipcode() {
        return zipcode;
    }
}
