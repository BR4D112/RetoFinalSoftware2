package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.CustomerRespository;

@Service
public class CustomerService {
    @Autowired
    private final CustomerRespository cRespository;
    

    public CustomerService(CustomerRespository cRespository) {
        this.cRespository = cRespository;
    }

    public void addCustomer(Customer savedCustomer) {
        cRespository.save(savedCustomer);
    }
    
    public void updateCustomer(Customer savedCustomer) {
        cRespository.save(savedCustomer);
    }

    public void deleteCustomer(Customer savedCustomer) {
        cRespository.delete(savedCustomer);
    }
    
}
