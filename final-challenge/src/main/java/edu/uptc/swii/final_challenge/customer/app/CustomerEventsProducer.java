package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.utils.JsonUtils;

@Service
public class CustomerEventsProducer {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private String type;
    private Customer customer;
    public KafkaTemplate<String, String> getKafkaTemplate() {
        return kafkaTemplate;
    }
    public String getType() {
        return type;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void sendMessage(String topic, Customer customer){
        String message = new String();
        JsonUtils utils = new JsonUtils();
        message = utils.toJson(customer);
        System.out.println("CustomerEventProducer sendMessage: "+message);
        kafkaTemplate.send(topic, message);
    }
    
}
