package edu.uptc.swii.final_challenge.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.infrastructure.adapter.output.CustomerMongoRepository;
import edu.uptc.swii.final_challenge.customer.infrastructure.port.output.CustomerRepositoryPort;

@Service
public class CustomerServiceImpl {
    private final CustomerRepositoryPort customerRepositoryPort; // JPA para MySQL
    private final CustomerMongoRepository customerMongoRepository; // MongoDB
    private final CustomerEventsProducer customerEventsProducer;

    @Autowired
    public CustomerServiceImpl(CustomerRepositoryPort customerRepositoryPort, CustomerMongoRepository customerMongoRepository,
        CustomerEventsProducer customerEventsProducer) {
        this.customerRepositoryPort = customerRepositoryPort;
        this.customerMongoRepository = customerMongoRepository;
        this.customerEventsProducer = customerEventsProducer;
    }

    public void addCustomer(Customer customer) {
        customerRepositoryPort.save(customer);  // Guarda en MySQL
        customerMongoRepository.save(customer);
        customerEventsProducer.sendMessage("add-customer-topic", customer);
        
    }

    public void updateCustomer(Customer customer) {
        customerRepositoryPort.save(customer);  // Actualiza en MySQL
        customerMongoRepository.save(customer);  // Actualiza en MongoDB
    }

    public void deleteCustomer(Customer customer) {
        customerRepositoryPort.delete(customer);  // Elimina de MySQL
        customerMongoRepository.delete(customer);  // Elimina de MongoDB
    }

    public Customer getCustomerById(String customerId) {
        // Aquí se puede implementar la lógica para buscar un cliente por ID
        // Asumimos que hay un método para encontrar el cliente en ambos repositorios
        Customer customer = customerRepositoryPort.findById(customerId).orElse(null);
        if (customer == null) {
            customer = customerMongoRepository.findById(customerId).orElse(null);
        }
        return customer;
    }
}
