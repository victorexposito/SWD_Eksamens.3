package kea.service;

import kea.model.Customer;
import kea.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ServiceI<Customer> {

    @Autowired
    CustomerRepository CR = new CustomerRepository();

    @Override
    public Customer create(Customer customer) {
        return CR.create(customer);
    }

    @Override
    public Customer readId(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public boolean delete(int id) {

        return true;
    }

    @Override
    public List<Customer> readAll(){
        return null;
    }

    @Override
    public List<Customer> read() {
        return null;
    }


}
