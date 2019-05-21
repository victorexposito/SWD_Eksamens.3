package kea.repository;

import kea.model.Customer;
import kea.model.Customer_Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements RepositoryI<Customer>{

    @Autowired
    JdbcTemplate template;

    @Override
    public Customer create(Customer customer) {

        String sql = "insert into customer(customer_id, first_name, last_name, phone_number, email, city, zip_code, course_name, course_duration, course_price, location_name, location_address, location_city)\n" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        template.update(sql, customer.getCustomer_id(), customer.getFirst_name(), customer.getLast_name(), customer.getPhone_number(), customer.getEmail(), customer.getCity(), customer.getZip_code(), customer.getCourse_name(), customer.getCourse_duration(), customer.getCourse_price(), customer.getLocation_name(), customer.getLocation_address(), customer.getLocation_city());

        return customer;
    }

    @Override
    public Customer readId(int id) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> read() { return null; }

}
