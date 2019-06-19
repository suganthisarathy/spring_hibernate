package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c)
	{
		new CustomerDaoImpl().insertCustomer(c);
		
		
	}

	public int updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		int i=new CustomerDaoImpl().updateCustomer(c1);
		return i;
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public List<Customer> fetchCustomer() {
		// TODO Auto-generated method stub
		List<Customer> l=new CustomerDaoImpl().fetchCustomer();
		
		return l;
	}
	
}
