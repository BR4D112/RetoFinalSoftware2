package edu.uptc.swii.final_challenge.customer.domain.service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.output.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerQueryService {
    private final CustomerRepositoryPort customerRepository;

    public Customer findCustomerById(String document) {
        return customerRepository.findById(document)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
