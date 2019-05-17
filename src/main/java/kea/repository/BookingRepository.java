package kea.repository;


import kea.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepository implements RepositoryI<Booking> {

    @Autowired
    JdbcTemplate template;


    @Override
    public Booking create(Booking booking) {
        String sql = "insert into booking (booking_id, signup_date, customer_id) values = (?, ?, (select customer_id from customer where customer_id = Last_insert_id";
        template.update()

        return booking;

    }

    @Override
    public Booking read(Booking booking) {
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public Booking delete(Booking booking) {
        return null;
    }


    }
}
