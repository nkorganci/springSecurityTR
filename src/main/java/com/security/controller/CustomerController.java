package com.security.controller;

import com.security.model.Customer;
import com.security.repository.CustomerRepository;
import com.security.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //1 POST a customer
    @PostMapping("/customers")
    public List<Customer> addCustomerController(@RequestBody List<Customer> customer){

        return customerService.addCustomerService(customer);
    }
    // 2 GET mapping
    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.showAllCustomers();
    }
}
