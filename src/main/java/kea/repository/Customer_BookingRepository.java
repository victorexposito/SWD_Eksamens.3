package kea.repository;

import kea.model.Customer_Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Customer_BookingRepository implements RepositoryI<Customer_Booking>{

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet rs;
    //ArrayList<Customer_Booking>customer_bookings;
    public void test(){

    }
    //Læser admin menu.
    @Override
    public List<Customer_Booking> read(){
    ArrayList<Customer_Booking> customer_bookings = new ArrayList<>();
    rs = jdbc.queryForRowSet("select cu.customer_id, cu.first_name, cu.last_name, cu.course_name, cu.location_name, b.signup_date\n" +
            "from booking b\n" +
            "join customer cu on b.customer_id = cu.customer_id\n" +
            "where b.booking_id > 0\n" +
            "Order by b.signup_date desc");
    while (rs.next()){
        customer_bookings.add(new Customer_Booking(rs.getInt("customer_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("course_name"),
                rs.getString("location_name"),
                rs.getDate("signup_date")));
    }

    return customer_bookings;
    }

    @Override
    public Customer_Booking create(Customer_Booking customer_booking) {
        return null;
    }

    @Override
    public Customer_Booking readId (int id) {

            rs = jdbc.queryForRowSet("select cu.customer_id, cu.first_name, cu.last_name, cu.course_name, cu.location_name, b.signup_date from booking b join customer cu on b.customer_id = cu.customer_id where b.booking_id = '"+ id +"'Order by b.signup_date desc");
        while (rs.next()){
            return new Customer_Booking(rs.getInt("id"),
            rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("course_name"),
                    rs.getString("location_name"),
                    rs.getDate("signup_date"));
        }

        return new Customer_Booking();
    }


    @Override
    public Customer_Booking update(Customer_Booking customer_booking) {
        return null;
    }

    @Override
    public Customer_Booking delete(Customer_Booking customer_booking) {

        int result = jdbc.update("DELETE FROM customer_booking WHERE customer_id = ?");

        return customer_booking;
    }
}
