package kea.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

public class Customer {

    private int customer_id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String city;
    private String zipcode;
    private String course;
    private String location;
    @DateTimeFormat(iso = DATE)
    private Date signup_date;

    public Customer() {
    }

    public Customer(int customer_id, String first_name, String last_name, String course, String location, Date signup_date) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.course = course;
        this.location = location;
        this.signup_date = signup_date;
    }

    public Customer(int customer_id, String first_name, String last_name, String phone_number, String email, String city, String zipcode, String course, String location, Date signup_date) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.zipcode = zipcode;
        this.course = course;
        this.location = location;
        this.signup_date = signup_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }
}
