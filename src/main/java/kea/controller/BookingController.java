package kea.controller;


import kea.model.Booking;
import kea.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/test")
    public @ResponseBody Collection<Booking> bookingViews(){
        //System.out.println(bookingRepository.bookingView());
        return bookingRepository.bookingView();

    }

}
