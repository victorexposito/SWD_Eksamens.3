package kea.controller;


import kea.model.Booking;
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

    List<Customer_Booking> cbooking = new ArrayList<>();

    @GetMapping("/addcustomer")
    public String readAllCustomers(Model model){
        CBR.read();
        model.addAttribute("cbooking", cbooking);
        return "addcustomer";
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Booking booking, Model model){
        BR.create(booking);
        CBR.read();
        model.addAttribute("booking", booking);
        return "addcustomer";
    }

}
