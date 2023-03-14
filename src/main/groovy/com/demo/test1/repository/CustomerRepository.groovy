package com.demo.test1.repository

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.test1.model.Customer;

@Repository
interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByRef(String ref);

}