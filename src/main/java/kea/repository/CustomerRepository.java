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

        String sql = "insert into customer(customer_id, first_name, last_name, phone_number, email, city, zipcode, course, location, signup_date)\n" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbc.update(sql, customer.getCustomer_id(), customer.getFirst_name(), customer.getLast_name(), customer.getPhone_number(), customer.getEmail(), customer.getCity(), customer.getZipcode(), customer.getCourse(), customer.getLocation(),customer.getSignup_date());

        return customer;
    }

    @Override
    public List<Customer> read() {
        ArrayList<Customer> customers = new ArrayList<>();
        rs = jdbc.queryForRowSet("select customer_id, first_name, last_name, course, location, signup_date\n" +
                "from customer\n" +
                "where customer_id > 0\n" +
                "Order by signup_date desc");
        while (rs.next()) {
            customers.add(new Customer(rs.getInt("customer_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("course"),
                    rs.getString("location"),
                    rs.getDate("signup_date")));


        }
        return customers;
    }


    @Override
    public Customer readId(int id) {

        rs = jdbc.queryForRowSet("select * from customer where customer_id = '"+ id +"'");
        while (rs.next()){
            return new Customer(rs.getInt("customer_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("phone_number"),
                rs.getString("email"),
                rs.getString("city"),
                rs.getString("zipcode"),
                rs.getString("course"),
                rs.getString("location"),
                rs.getDate("signup_date"));
        }
        return new Customer();
    }

    @Override
    public Customer update(Customer customer) {
        String sql = "UPDATE customer SET phone_number = ?, email = ?, city = ?, zipcode = ?, course = ?, location = ? WHERE customer_id = ?";
        jdbc.update(sql, customer.getPhone_number(), customer.getEmail(), customer.getCity(), customer.getZipcode(), customer.getCourse(), customer.getLocation(), customer.getCustomer_id());
        return customer;
    }

    @Override
    public boolean delete(int id){
        jdbc.update("DELETE FROM customer WHERE customer_id = '" + id + "'");
        return true;
    }
}

