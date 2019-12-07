package com.avitutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avitutorial.dao.CustomerDao;
import com.avitutorial.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	CustomerDao customerDao;
@Autowired
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Customer> listAllCustomers() {
		return customerDao.listAllCustomers() ;
	}

	public void saveOrUpdate(Customer customer) {
		customerDao.saveOrUpdate(customer);
		
	}

	public Customer findCustomerById(int id) {
		
		return customerDao.findCustomerById(id);
	}

	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
		
	}

}
