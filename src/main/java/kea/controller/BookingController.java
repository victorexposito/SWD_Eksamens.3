package kea.controller;


import kea.model.Booking;
import kea.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/test")
    public String testForm(Model model){
        System.out.println(bookingRepository.view());
        model.addAttribute("booking", bookingRepository.view());
        return "test";

    }


}
