package kea.service;

import kea.model.Customer_Booking;
import kea.repository.Customer_BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Customer_BookingService implements ServiceI<Customer_Booking> {

    @Autowired
    Customer_BookingRepository CBR = new Customer_BookingRepository();


    @Override
    public Customer_Booking create(Customer_Booking customer_booking) {
        return null;
    }

    @Override
    public Customer_Booking readId(Customer_Booking customer_booking) {
        return null;
    }

    @Override
    public Customer_Booking update(Customer_Booking customer_booking) {
        return null;
    }

    @Override
    public Customer_Booking delete(Customer_Booking customer_booking) {
        return CBR.delete(customer_booking);
    }

    @Override
    public List<Customer_Booking> read() {
        return null;
    }
}
