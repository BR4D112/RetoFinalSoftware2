package edu.uptc.swii.final_challenge.customer.infrastructure.adapter.output;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
}
