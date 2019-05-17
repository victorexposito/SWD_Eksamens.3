package kea.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

public class Customer_Booking {

    private int id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String city;
    private String zip_code;
    private String course_name;
    private String course_duration;
    private String course_price;
    private String location_name;
    private String location_address;
    private String location_city;
    private int booking_id;
    @DateTimeFormat(iso = DATE) // datoen formateres til YYYY-MM-DD
    private Date signup_date;

    public Customer_Booking() {
    }

    public Customer_Booking(String first_name, String last_name, String course_name, String location_name, Date signup_date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.course_name = course_name;
        this.location_name = location_name;
        this.signup_date = signup_date;
    }

    public Customer_Booking(int id, String first_name, String last_name, String phone_number, String email, String city, String zip_code, String course_name, String course_duration, String course_price, String location_name, String location_address, String location_city, int booking_id, Date signup_date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.zip_code = zip_code;
        this.course_name = course_name;
        this.course_duration = course_duration;
        this.course_price = course_price;
        this.location_name = location_name;
        this.location_address = location_address;
        this.location_city = location_city;
        this.booking_id = booking_id;
        this.signup_date = signup_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_price() {
        return course_price;
    }

    public void setCourse_price(String course_price) {
        this.course_price = course_price;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getLocation_address() {
        return location_address;
    }

    public void setLocation_address(String location_address) {
        this.location_address = location_address;
    }

    public String getLocation_city() {
        return location_city;
    }

    public void setLocation_city(String location_city) {
        this.location_city = location_city;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }
}
