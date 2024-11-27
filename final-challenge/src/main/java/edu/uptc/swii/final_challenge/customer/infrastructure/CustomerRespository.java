package edu.uptc.swii.final_challenge.customer.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uptc.swii.final_challenge.customer.domain.Customer;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, String>{

}