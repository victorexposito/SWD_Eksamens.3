package kea.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class Customer_BookingRepository {
    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet rs;






}
