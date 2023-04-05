package com.test.spring.dao;

import com.test.spring.model.Customer;

public interface CustomerDAO {
	
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);

}
