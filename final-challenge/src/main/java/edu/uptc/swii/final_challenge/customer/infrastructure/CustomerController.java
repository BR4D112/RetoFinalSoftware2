package edu.uptc.swii.final_challenge.customer.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CustomerController {
    @PostMapping("/createcustomer")
    public boolean saveCustomerController(@RequestBody String customer) {
        //TODO: process POST request
        return true;
    }
    @GetMapping("/findcustomerbyid")
    public String getCustomer(@RequestBody String customer) {
        //TODO 
        return customer;
    }
    
}
