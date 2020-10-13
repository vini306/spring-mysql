package com.vtech.springmysql.controller;

import java.util.List;

import java.util.stream.Collectors;

import com.vtech.springmysql.controller.dto.CustomerRs;
import com.vtech.springmysql.repository.CustomerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  private final CustomerRepository customerRepository;
  
  public CustomerController(CustomerRepository customerRepository){
    this.customerRepository = customerRepository;
  }

  @GetMapping("/")
  public List<CustomerRs>findAll(){
    var customer = customerRepository.findAll();
    return customer.stream().map(CustomerRs::convert).collect(Collectors.toList());
  }

  public CustomerRs customerById(@PathVariable("id") Long id){
  var customer =customerRepository.getOne(id);

  }
}
