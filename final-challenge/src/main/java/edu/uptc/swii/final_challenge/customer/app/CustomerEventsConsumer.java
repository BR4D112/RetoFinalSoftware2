package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.utils.JsonUtils;

public class CustomerEventsConsumer {
    @Autowired
    private CustomerService customerService;

    private Customer formatCustomer(String message){
        message=message.replace("\\","");
        message=message.substring(1, message.length()-1);
        JsonUtils jsonUtils = new JsonUtils();
        return jsonUtils.fromJson(message, Customer.class); 
    }
    @KafkaListener(topics="" , groupId="customerId")
    public void addCustomerConsume(String message){
        System.out.println("Add Customer - Received Message: " + message);
        customerService.addCustomer(this.formatCustomer(message));
    }
    @KafkaListener(topics="" , groupId="customerId")
    public void updateCustomerConsume(String message){
        System.out.println("Update Customer - Received Message: " + message);
        customerService.updateCustomer(this.formatCustomer(message));
    }
    @KafkaListener(topics="" , groupId="customerId")
    public void deleteCustomerConsume(String message){
        System.out.println("Delete Customer - Received Message: " + message);
        customerService.deleteCustomer(this.formatCustomer(message));
    }
}
