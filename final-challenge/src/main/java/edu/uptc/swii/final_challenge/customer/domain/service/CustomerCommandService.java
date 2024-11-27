package edu.uptc.swii.final_challenge.customer.domain.service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.output.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerCommandService {
    private final CustomerRepositoryPort customerRepository;

    public boolean createCustomer(Customer customer) {
        customerRepository.save(customer);
        return true;
    }

    public boolean updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return true;
    }

    public boolean deleteCustomer(String document) {
        Customer customer = customerRepository.findById(document)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customerRepository.delete(customer);
        return true;
    }
}
