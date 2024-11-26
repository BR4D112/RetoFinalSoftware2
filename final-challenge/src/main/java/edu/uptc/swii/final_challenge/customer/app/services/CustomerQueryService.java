package edu.uptc.swii.final_challenge.customer.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.CustomerRespository;

public class CustomerQueryService {
     @Autowired
    private final CustomerRespository cRespository;
    
    public CustomerQueryService(CustomerRespository cRespository) {
        this.cRespository = cRespository;
    }
    //Query section
    public List<Customer> getAllCustomers(Customer customer){
        return cRespository.findAll();
    }
    
}
