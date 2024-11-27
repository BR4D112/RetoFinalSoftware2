package edu.uptc.swii.final_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("edu.uptc.swii.final_challenge.customer.infrastructure")
@EntityScan("edu.uptc.swii.final_challenge.customer.domain")
@SpringBootApplication
public class FinalChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalChallengeApplication.class, args);
	}

}
