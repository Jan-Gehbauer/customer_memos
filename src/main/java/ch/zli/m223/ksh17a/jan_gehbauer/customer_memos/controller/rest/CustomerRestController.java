package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.CustomerDto;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.MemoDto;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.customer.CustomerService;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.memo.MemoService;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	MemoService memoService;
	
	@GetMapping("/rest/customers")
	List<CustomerDto> getCustomerList() {
		
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/rest/customers/{id}")
	CustomerDto getCustomer(@PathVariable("id") Long id) {
		
		return new CustomerDto(customerService.getCustomerById(id));
	}
	
	@PostMapping("/rest/customers")
	CustomerDto createCustomer(@RequestBody CustomerDto customerDto) {
		
		return new CustomerDto(customerService.createCustomer(customerDto.name));
	}
	
	@DeleteMapping("/rest/customers/{id}")
	void deleteCustomer(@PathVariable("id") Long id) {
		
		customerService.deleteCustomer(id);
	}
	
	@GetMapping("/rest/customers/{id}/memos")
	List<MemoDto> getMemos(@PathVariable("id") Long customerId) {
		
		return memoService.getCustomerMemos(customerId);
	}
	
	@PostMapping("/rest/customers/{id}/memos")
	MemoDto createMemo(@RequestBody MemoDto memoDto) {
		
		return memoService.createMemo(memoDto);
	}
}