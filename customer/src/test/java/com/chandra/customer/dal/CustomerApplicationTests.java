package com.chandra.customer.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chandra.customer.dal.entity.Customer;
import com.chandra.customer.dal.repos.ICustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	private ICustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Chandra");
		customer.setEmail("rimictd@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById() {
		Optional<Customer> customerbyid = customerRepository.findById(1L);
		if (customerbyid.isPresent()) {
			System.out.println(customerbyid.get().toString());
		}
	}

	@Test
	public void testUpdateStudentBy() {
		Optional<Customer> customerbyid = customerRepository.findById(1L);
		if (customerbyid.isPresent()) {
			customerbyid.get().setEmail("ctdrimi@gmail.com");
			customerRepository.save(customerbyid.get());

		}
	}

	@Test
	public void testDeleteStudentBy() {
		customerRepository.deleteById(1L);

	}

}
