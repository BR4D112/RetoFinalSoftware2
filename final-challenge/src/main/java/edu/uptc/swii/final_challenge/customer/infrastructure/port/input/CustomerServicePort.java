package edu.uptc.swii.final_challenge.customer.infrastructure.port.input;

import edu.uptc.swii.final_challenge.customer.domain.Customer;

public interface CustomerServicePort {
    boolean createCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    Customer findCustomerById(String document);
    boolean deleteCustomer(String document);
}