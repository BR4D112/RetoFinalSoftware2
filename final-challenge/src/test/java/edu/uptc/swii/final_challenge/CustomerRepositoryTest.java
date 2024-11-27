package edu.uptc.swii.final_challenge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import edu.uptc.swii.final_challenge.model.Customer;
import edu.uptc.swii.final_challenge.repository.CustomerRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testSaveCustomer() {
        // Crear un nuevo cliente
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Guardar el cliente
        Customer savedCustomer = customerRepository.save(customer);

        // Validar que el cliente fue guardado
        assertThat(savedCustomer.getId()).isNotNull();
        assertThat(savedCustomer.getName()).isEqualTo("John Doe");
        assertThat(savedCustomer.getEmail()).isEqualTo("john.doe@example.com");
    }
}
