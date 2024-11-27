package edu.uptc.swii.final_challenge.customer.infrastructure.port.output;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import java.util.Optional;

public interface CustomerRepositoryPort {
    void save(Customer customer);
    Optional<Customer> findById(String document);
    void delete(Customer customer);
}