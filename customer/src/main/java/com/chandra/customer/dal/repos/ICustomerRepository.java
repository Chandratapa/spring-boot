package com.chandra.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.chandra.customer.dal.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {

}
