package edu.uptc.swii.final_challenge.customer.app.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import edu.uptc.swii.final_challenge.customer.app.services.CustomerQueryService;
import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.utils.JsonUtils;

public class CustomerEventsConsumer {
    @Autowired
    private CustomerQueryService customerService;

    private Customer formatCustomer(String message){
        message=message.replace("\\","");
        message=message.substring(1, message.length()-1);
        return JsonUtils.fromJson(message, Customer.class); 
    }
    @KafkaListener (topics="add_customer_events", groupId = "customer-group")
    public void addCustomerConsume(){
        
    }
    @KafkaListener (topics="update_customer_events", groupId = "customer-group")
    public void updateCustomerConsume(){

    }
    @KafkaListener (topics="delete_customer_events", groupId = "customer-group")
    public void deleteCustomerConsume(){

    }
    
}
