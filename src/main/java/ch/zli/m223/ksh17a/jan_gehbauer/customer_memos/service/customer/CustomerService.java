package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.customer;

import java.util.List;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.CustomerDto;

public interface CustomerService {
	
	// get all customers

	public List<CustomerDto> getAllCustomers();
	
	// get a customer by the id

	public Customer getCustomerById(Long id);
	
	// create a new customer

	public Customer createCustomer(String name);
	
	// delete a customer

	public void deleteCustomer(Long id);
}