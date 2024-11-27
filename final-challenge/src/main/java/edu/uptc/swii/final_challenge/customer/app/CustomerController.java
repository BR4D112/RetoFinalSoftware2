package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.app.CustomerServiceImpl;

@RestController
public class CustomerController {

    private final CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/createcustomer")
    public boolean saveCustomerController(@RequestBody Customer customer) {
        customerService.addCustomer(customer);  // Guarda el cliente
        return true;
    }

    @GetMapping("/findcustomerbyid")
    public Customer getCustomer(@RequestParam String customerId) {
        return customerService.getCustomerById(customerId);  // Asume que existe un método para obtener un cliente por ID
    }
}
