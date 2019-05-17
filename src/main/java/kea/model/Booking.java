package kea.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

public class Booking {

    private int booking_id;
    @DateTimeFormat(iso = DATE)
    private Date signup_date;
    private int customer_id;

    public Booking() {
    }

    public Booking(int booking_id, Date signup_date, int customer_id) {
        this.booking_id = booking_id;
        this.signup_date = signup_date;
        this.customer_id = customer_id;
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

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
