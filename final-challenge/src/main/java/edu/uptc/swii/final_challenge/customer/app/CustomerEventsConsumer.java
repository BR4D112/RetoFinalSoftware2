package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.utils.JsonUtils;

public class CustomerEventsConsumer {
    @Autowired
    private CustomerService customerService;

    @KafkaListener(topics="" , groupId="")
    public void addCustomerConsume(String message){
        message=message.replace("\\","");
        message=message.substring(1, message.length()-1);
        System.out.println("Add Customer - Received Message: " + message);
        JsonUtils jsonUtils = new JsonUtils();
        Customer savedCustomer = jsonUtils.fromJson(message, Customer.class);
        customerService.addCustomer(savedCustomer);
    }
    @KafkaListener(topics="" , groupId="")
    public void updateCustomerConsume(String message){
        message=message.replace("\\","");
        message=message.substring(1, message.length()-1);
        System.out.println("update Customer - Received Message: " + message);
        JsonUtils jsonUtils = new JsonUtils();
        Customer savedCustomer = jsonUtils.fromJson(message, Customer.class);
        customerService.updateCustomer(savedCustomer);
    }
    @KafkaListener(topics="" , groupId="")
    public void deleteCustomerConsume(String message){
        message=message.replace("\\","");
        message=message.substring(1, message.length()-1);
        System.out.println("delete Customer - Received Message: " + message);
        JsonUtils jsonUtils = new JsonUtils();
        Customer savedCustomer = jsonUtils.fromJson(message, Customer.class);
        customerService.deleteCustomer(savedCustomer);
    }
}
