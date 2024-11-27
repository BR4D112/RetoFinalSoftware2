package edu.uptc.swii.final_challenge.customer.infrastructure.port.input;

import edu.uptc.swii.final_challenge.customer.domain.Customer;

public interface CustomerCommandPort {
    boolean createCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(String document);
}
