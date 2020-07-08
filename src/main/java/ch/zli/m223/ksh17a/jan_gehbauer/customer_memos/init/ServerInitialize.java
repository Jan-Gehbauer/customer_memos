package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.repository.customer.CustomerRepository;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.repository.memo.MemoRepository;

@Component
public class ServerInitialize implements ApplicationRunner {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	MemoRepository memoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Customer customer1, customer2, customer3, customer4;
		
		customer1 = customerRepository.createCustomer("customer1");
		customer2 = customerRepository.createCustomer("customer2");
		customer3 = customerRepository.createCustomer("customer3");
		customer4 = customerRepository.createCustomer("customer4");
		
		memoRepository.createMemo(customer1, "note for customer 1");
		memoRepository.createMemo(customer1, "another note for customer 1");
		memoRepository.createMemo(customer2, "note for customer 2");
		memoRepository.createMemo(customer3, "note for customer 3");
		memoRepository.createMemo(customer4, "note for customer 4");
	}
}