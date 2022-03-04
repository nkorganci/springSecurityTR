package com.security.service;

import com.security.model.Customer;
import com.security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    //1 POST a Customer
    public List<Customer> addCustomerService(List<Customer> customer){
        return customerRepository.saveAll(customer);
    }

    // 2 Get customer
    public List<Customer> showAllCustomers(){
        return customerRepository.findAll();
    }


}
