package edu.uptc.swii.final_challenge.customer.infrastructure.adapter.input;

import edu.uptc.swii.final_challenge.customer.domain.Customer;
import edu.uptc.swii.final_challenge.customer.domain.service.CustomerCommandService;
import edu.uptc.swii.final_challenge.customer.domain.service.CustomerQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerRestAdapter {
    private final CustomerCommandService commandService;
    private final CustomerQueryService queryService;

    // Comandos
    @PostMapping("/create")
    public boolean createCustomer(@RequestBody Customer customer) {
        return commandService.createCustomer(customer);
    }

    @PutMapping("/update")
    public boolean updateCustomer(@RequestBody Customer customer) {
        return commandService.updateCustomer(customer);
    }

    @DeleteMapping("/delete")
    public boolean deleteCustomer(@RequestParam String document) {
        return commandService.deleteCustomer(document);
    }

    // Consultas
    @GetMapping("/find")
    public Customer findCustomerById(@RequestParam String document) {
        return queryService.findCustomerById(document);
    }
}
