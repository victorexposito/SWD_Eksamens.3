package kea.repository;


import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements RepositoryI<Customer>{

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer read(Customer customer) {
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
    public List<Customer> readAll(){

        return null;
    }
}
