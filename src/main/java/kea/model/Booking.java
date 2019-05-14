package kea.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;
    private int customer_id;
    private int course_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String start_date_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String end_date_time;

    public Booking() {
    }

    public Booking(int customer_id, int course_id, String start_date_time, String end_date_time) {
        this.customer_id = customer_id;
        this.course_id = course_id;
        this.start_date_time = start_date_time;
        this.end_date_time = end_date_time;
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getStart_date_time() {
        return start_date_time;
    }

    public void setStart_date_time(String start_date_time) {
        this.start_date_time = start_date_time;
    }

    public String getEnd_date_time() {
        return end_date_time;
    }

    public void setEnd_date_time(String end_date_time) {
        this.end_date_time = end_date_time;
    }
}
