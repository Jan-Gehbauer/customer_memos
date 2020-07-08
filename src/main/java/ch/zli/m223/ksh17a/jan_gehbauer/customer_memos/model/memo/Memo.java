package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo;

import java.sql.Date;

public interface Memo {
	
	Long getId();
	
	Long getCustomerId();
	
	String getNote();
	
	Date getDate();
}