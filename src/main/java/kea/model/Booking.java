package kea.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer booking_id;
    private int customer_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Booking(){

    }


    public Booking(int customer_id, Date date) {
        this.customer_id = customer_id;

        this.date = date;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }





    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

