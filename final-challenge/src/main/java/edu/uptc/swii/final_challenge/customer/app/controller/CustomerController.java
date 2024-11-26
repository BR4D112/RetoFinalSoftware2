package edu.uptc.swii.final_challenge.customer.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CustomerController {
    
    @PostMapping("/createcustomer")
    public boolean saveCustomerController(@RequestBody String customer) {
        return true;
    }
    @GetMapping("/findcustomerbyid")
    public String getCustomer(@RequestParam String customer) {
        //TODO 
        return customer;
    }
    
}
