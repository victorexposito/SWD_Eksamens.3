package kea.repository;


import kea.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingRepository implements RepositoryI<Booking> {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet rs;

    @Override
    public Booking create(Booking booking) {
        String sql = "insert into booking (booking_id, signup_date, customer_id)\n" +
                "select ?,'2010-10-10', max(customer_id) from customer";
        jdbc.update(sql, booking.getSignup_date(), booking.getCustomer_id());

        return booking;

    }

    @Override
    public Booking readId(int id) {
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public Booking delete(Booking booking) {

        int result = jdbc.update("DELETE FROM  booking WHERE customer_id = ?");

        return booking;
    }

    @Override
    public List<Booking> read() { return null; }


    }

