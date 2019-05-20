package kea.controller;


import kea.repository.BookingRepository;
import kea.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository CR;

     @Autowired
    BookingRepository BR;

    @PostMapping("/addBooking")
    public String addBooking(Model model){

        model.addAttribute("customer_Booking",  )
        return null;
    }

}
