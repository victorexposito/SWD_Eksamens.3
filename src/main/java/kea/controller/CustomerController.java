package kea.controller;


import kea.model.Booking;
import kea.model.Customer;
import kea.model.Customer_Booking;
import kea.repository.BookingRepository;
import kea.repository.CustomerRepository;
import kea.repository.Customer_BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository CR;

     @Autowired
    BookingRepository BR;

     @Autowired
    Customer_BookingRepository CBR;

     Booking booking = new Booking();
    List<Customer_Booking> cbooking = new ArrayList<>();

    @GetMapping("/addcustomer")
    public String readAllCustomers(Model model){
        CBR.read();
        model.addAttribute("cbooking", cbooking);
        return "addcustomer";
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Customer customer, Model model){
        CR.create(customer);
        BR.create(booking);
        CBR.read();
        model.addAttribute("customer", customer);
        return "addcustomer";
    }

}
//alt der står i customer skal til en form på /addcustomer. med en knap til createv