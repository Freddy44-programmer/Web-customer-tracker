package Codewithfreddy.springdemo.dao;

import java.util.List;

import Codewithfreddy.springdemo.entity.Customer;


public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);

}
