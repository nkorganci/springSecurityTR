package com.security.service;

import com.security.model.Customer;
import com.security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    //1 POST a Customer
    public Customer addCustomerService(Customer customer){
        return customerRepository.save(customer);
    }


}
