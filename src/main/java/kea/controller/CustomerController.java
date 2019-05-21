package kea.controller;


import kea.model.Customer;
import kea.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository CR;

    private List<Customer> customer = new ArrayList<>();

    @GetMapping("/addcustomer")
    public String addCustomer(Model model){
        customer = CR.readAll();
        model.addAttribute("customer", customer);
        return "addcustomer";
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Customer customer, Model model){
        CR.create(customer);
        CR.read();
        model.addAttribute("customer", customer);

        return "addcustomer";
    }
    @GetMapping("/adminmenu")
    public String index(Model model){
        model.addAttribute("customer", CR.read());
        return "adminmenu";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("customer_id") int id, Model model) {
        model.addAttribute("instructor", CR.readId(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Customer customer) {
        CR.delete(customer.getCustomer_id());
        return "redirect:/InstructorIndex";
    }

}
//alt der står i customer skal til en form på /addcustomer. med en knap til createv