package kea.controller;

import kea.repository.Customer_BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Customer_BookingController {
    private final Customer_BookingRepository customer_bookingRepository;



    @Autowired
    public Customer_BookingController(Customer_BookingRepository customer_bookingRepository){
        this.customer_bookingRepository = customer_bookingRepository;
    }


    @GetMapping("/adminmenu")
    public String index(Model model){
        model.addAttribute("customer_booking", customer_bookingRepository.read());
        return "adminmenu";
    }


}
