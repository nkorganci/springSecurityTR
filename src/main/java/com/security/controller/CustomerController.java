package com.security.controller;

import com.security.model.Customer;
import com.security.repository.CustomerRepository;
import com.security.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //1 POST a customer
    @PostMapping("/add")
    public Customer addCustomerController(@RequestBody Customer customer){

        return customerService.addCustomerService(customer);
    }
}
