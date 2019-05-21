package kea.service;

import kea.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService implements ServiceI<Booking> {

    @Autowired
    BookingRepository BR = new BookingRepository();

    @Override
    public Booking create(Booking booking) {
        return BR.create(booking);
    }

    @Override
    public Booking readId(Booking booking) {
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public Booking delete(Booking booking) {
        return BR.delete(booking);
    }

    @Override
    public List read() {
        return null;
    }

}
