package edu.uptc.swii.final_challenge.customer.domain.service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.input.CustomerServicePort;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.output.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerDomainService implements CustomerServicePort {
    private final CustomerRepositoryPort customerRepository;

    @Override
    public boolean createCustomer(Customer customer) {
        customerRepository.save(customer);
        return true;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public Customer findCustomerById(String document) {
        throw new UnsupportedOperationException("Unimplemented method 'findCustomerById'");
    }

    @Override
    public boolean deleteCustomer(String document) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

}