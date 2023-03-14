package com.demo.test1.service


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service
import com.demo.test1.model.Customer;
import com.demo.test1.repository.CustomerRepository;

@Service
class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}

