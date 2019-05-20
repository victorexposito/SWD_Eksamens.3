package kea.controller;

import kea.repository.Customer_BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/")
    public String delete (){
        return null;// Der skal laves html delete side
    }

    @GetMapping("/")
    public String delete(@RequestParam("id") int customer_id, Model model){
    model.addAttribute("customer_booking", customer_bookingRepository.read(customer_id));
    return null; //der skal laves ny html deteleside
    }



}
