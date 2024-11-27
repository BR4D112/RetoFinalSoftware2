package edu.uptc.swii.final_challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.uptc.swii.final_challenge.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {}
