package com.vtech.springmysql.controller.dto;

import java.util.Date;

import com.vtech.springmysql.model.Customer;

public class CustomerRs {
  
  private Long id;
  private String name;
  private String lastName;
  private Integer age;
  private Date birthday;

  public static CustomerRs convert(Customer c){
    var customer = new CustomerRs();
    customer.setId(c.getId());
    customer.setName(c.getName());
    customer.setLastName(c.getLastName());
    customer.setAge(c.getAge());
    customer.setBirthday(c.getBirthday());

    return customer;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
