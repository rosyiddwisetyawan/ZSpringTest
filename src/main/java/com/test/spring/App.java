package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.dao.CustomerDAO;
import com.test.spring.model.Customer;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
//        Customer customer = new Customer("mkyong","087812563696");
//        customerDAO.insert(customer);
//    	
        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1.getMobilenumber());
	}

}
