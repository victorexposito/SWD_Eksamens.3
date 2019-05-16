package kea.repository;

import kea.model.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    @Query(value = "select booking_id, date from booking")
    ArrayList<Booking>view();



}
