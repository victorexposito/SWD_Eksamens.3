package kea.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){

        return "index";
    }

    @GetMapping("/courses")
    public String courseMenu(){
        return "courses";
    }

    @GetMapping("/location")
    public String loactionMenu(){
        return "location";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }
}
