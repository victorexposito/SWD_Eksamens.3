package kea.repository;

import kea.model.Customer_Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Customer_BookingRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet rs;
    ArrayList<Customer_Booking>customer_bookings;
    public void test(){

    }


public List<Customer_Booking> readMenu(){
    customer_bookings.clear();
    rs = jdbc.queryForRowSet("select cu.first_name, cu.last_name, cu.course_name, cu.location_name, b.signup_date\n" +
            "from booking b\n" +
            "join customer cu on b.customer_id = cu.customer_id\n" +
            "where b.booking_id > 0\n" +
            "Order by b.signup_date desc");
    while (rs.next()){
        customer_bookings.add(new Customer_Booking(rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("course_name"),
                rs.getString("location_name"),
                rs.getDate("signup_date")));
    }

    return customer_bookings;
}



}
