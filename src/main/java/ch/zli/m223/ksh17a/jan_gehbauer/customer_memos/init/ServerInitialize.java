package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.init;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
		
		customerRepository.createCustomer("customer1");
		customerRepository.createCustomer("customer2");
		customerRepository.createCustomer("customer3");
		customerRepository.createCustomer("customer4");
		
		memoRepository.createMemo(new Long(1), "test note", new Date(33333));
		memoRepository.createMemo(new Long(1), "test note 2", new Date(33333));
	}
}