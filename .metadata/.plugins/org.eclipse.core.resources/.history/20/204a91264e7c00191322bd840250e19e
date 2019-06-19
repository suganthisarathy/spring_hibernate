package com.pack.service;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c)
	{
		new CustomerDaoImpl().insertCustomer(c);
		
		
	}

	public void updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().updateCustomer(c1);
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public Customer fetchCustomer(int num) {
		// TODO Auto-generated method stub
		Customer c=new CustomerDaoImpl().fetchCustomer(num);
		
		return c;
	}
	
}
