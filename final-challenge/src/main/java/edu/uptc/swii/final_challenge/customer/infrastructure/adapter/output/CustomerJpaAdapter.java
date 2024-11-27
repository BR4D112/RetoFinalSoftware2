package edu.uptc.swii.final_challenge.customer.infrastructure.adapter.output;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.CustomerRespository;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.output.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CustomerJpaAdapter implements CustomerRepositoryPort {
    private final CustomerRespository customerRepository;

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(String document) {
        return customerRepository.findById(document);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }
}