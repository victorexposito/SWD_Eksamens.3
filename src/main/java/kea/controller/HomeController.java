package kea.controller;


import kea.model.Customer;
import kea.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    CustomerRepository CR;

    @GetMapping("/")
    public String home(){

        return "index";
    }

    @GetMapping("/courses")
    public String courseMenu(){
        return "courses";
    }

    @PostMapping("/courses")
    public String addNewCustomer(@ModelAttribute Customer customer, Model model){
        CR.create(customer);
        model.addAttribute("customer", customer);
        return "redirect:/checkout";
    }

    @GetMapping("/location")
    public String loactionMenu(){
        return "location";
    }

    @GetMapping("/payment")
    public String paymentMenu(){
        return "payment";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }
}
