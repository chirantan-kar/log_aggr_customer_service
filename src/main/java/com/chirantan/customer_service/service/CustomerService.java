package com.chirantan.customer_service.service;

import com.chirantan.customer_service.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAll();

    Optional<Customer> getById(Long id);

    Customer create(Customer customer);

    Customer update(Long id, Customer customerDetails);

    void delete(Long id);
}
