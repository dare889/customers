package com.demo.test1.controller

import com.demo.test1.model.Customer
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.test1.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/{ref}")
    Customer getCustomerByRef(@PathVariable String ref) {
        return customerRepository.findByRef(ref);
    }
}
