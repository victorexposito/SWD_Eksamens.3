package kea.repository;

import kea.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements RepositoryI<Customer> {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet rs;

    @Override
    public Customer create(Customer customer) {

        String sql = "insert into customer(customer_id, first_name, last_name, phone_number, email, city, zip_code, course_name, course_duration, course_price, location_name, location_address, location_city)\n" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbc.update(sql, customer.getCustomer_id(), customer.getFirst_name(), customer.getLast_name(), customer.getPhone_number(), customer.getEmail(), customer.getCity(), customer.getZip_code(), customer.getCourse_name(), customer.getCourse_duration(), customer.getCourse_price(), customer.getLocation());

        return customer;
    }

    @Override
    public List<Customer> read() {
        ArrayList<Customer> customers = new ArrayList<>();
        rs = jdbc.queryForRowSet("select customer_id, first_name, last_name, course_name, location, signup_date\n" +
                "from customer b\n" +
                "where customer_id > 0\n" +
                "Order by signup_date desc");
        while (rs.next()) {
            customers.add(new Customer(rs.getInt("customer_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("course_name"),
                    rs.getString("location"),
                    rs.getDate("signup_date")));


        }
        return customers;
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
        int result = jdbc.update("DELETE FROM  customer WHERE customer_id = ?");
        return customer;
    }
}

