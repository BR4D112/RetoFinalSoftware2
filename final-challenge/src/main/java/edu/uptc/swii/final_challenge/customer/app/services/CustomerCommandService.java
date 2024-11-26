package edu.uptc.swii.final_challenge.customer.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.swii.final_challenge.customer.app.Events.CustomerEventsProducer;
import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.CustomerRespository;

@Service
public class CustomerCommandService {
    @Autowired
    private final CustomerRespository cRespository;
    private final CustomerEventsProducer customerEventsProducer;
    

    public CustomerCommandService(CustomerRespository cRespository, CustomerEventsProducer customerEventsProducer) {
        this.cRespository = cRespository;
        this.customerEventsProducer = customerEventsProducer;
    }
    public Customer addCustomer(Customer customer) {
        Customer savedCustomer = cRespository.save(customer);
        //sending data to kafka
        customerEventsProducer.sendMessage("add_customer_events", savedCustomer);
        return savedCustomer;
    }
    
    public Customer updateCustomer(Customer customer) {
        Customer savedCustomer = cRespository.save(customer);
        //sending data to kafka
        customerEventsProducer.sendMessage("update_customer_events", savedCustomer);
        return savedCustomer;
    }

    public String deleteCustomer(Customer customer) {
        cRespository.delete(customer);
        //sending data to kafka
        customerEventsProducer.sendMessage("delete_customer_events", customer);
        return "to do";
    }
    
}
