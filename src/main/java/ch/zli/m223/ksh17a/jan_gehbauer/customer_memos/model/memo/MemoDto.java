package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo;

import java.sql.Date;

public class MemoDto {
	
	public long id;
	public long customerId;
	public String note;
	public Date date;
	
	public MemoDto() {} // for JPA only
	
	public MemoDto(Memo memo) {
		
		id = memo.getId();
		customerId = memo.getCustomerId();
		note = memo.getNote();
		date = memo.getDate();
	}
}