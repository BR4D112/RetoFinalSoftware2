package edu.uptc.swii.final_challenge.customer.infrastructure.port.input;

import edu.uptc.swii.final_challenge.customer.domain.Customer;

public interface CustomerQueryPort {
    Customer findCustomerById(String document);
}
