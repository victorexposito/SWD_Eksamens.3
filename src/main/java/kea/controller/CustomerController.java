package kea.controller;


import kea.model.Customer;
import kea.repository.CustomerRepository;
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

   /* @GetMapping("/addcustomer")
    public String readAllCustomers(Model model){
        CR.read();
        model.addAttribute("cbooking", cbooking);
        return "addcustomer";
    }*/

    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Customer customer, Model model){
        CR.create(customer);
        CR.read();
        model.addAttribute("customer", customer);

        return "addcustomer";
    }
    @GetMapping("/adminmenu")
    public String index(Model model){
        model.addAttribute("customer_booking", CR.read());
        return "adminmenu";
    }

}
//alt der står i customer skal til en form på /addcustomer. med en knap til createv