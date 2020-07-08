package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.customer;

import java.util.List;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.CustomerDto;

public interface CustomerService {

	public List<CustomerDto> getAllCustomers();

	public Customer getCustomerById(Long id);

	public Customer createCustomer(String name);

	public void deleteCustomer(Long id);
}