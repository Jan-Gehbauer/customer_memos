package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.Customer;

public interface Memo {
	
	// get memo id
	
	Long getId();
	
	// get the corresponding customer
	
	Customer getCustomer();
	
	// get the memo note
	
	String getNote();
	
	// get the memo date
	
	long getDate();
}