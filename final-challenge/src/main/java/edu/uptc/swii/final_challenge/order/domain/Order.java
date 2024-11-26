package edu.uptc.swii.final_challenge.order.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collation = "order")
public class Order {
    
    @Id
    @JsonProperty("orderid")
    private String orderID;
    
    @JsonProperty("customerid")
    private String customerID;
    
    @JsonProperty("status")
    private String status;

    public Order(String orderID, String customerID, String status) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.status = status;
    }
    public Order() {
    }
    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", customerID=" + customerID + ", status=" + status + "]";
    }
    
}