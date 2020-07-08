package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Memo")
public class MemoImpl implements Memo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long customerId;
	private String note;
	private Date date;
	
	protected MemoImpl() {} // for JPA only
	
	public MemoImpl(Long customerId, String note, Date date) {
		
		this.customerId = customerId;
		this.note = note;
		this.date = date;
	}
	
	@Override
	public Long getId() {
		
		return id;
	}
	
	@Override
	public Long getCustomerId() {
		
		return customerId;
	}
	
	@Override
	public String getNote() {
		
		return note;
	}
	
	@Override
	public Date getDate() {
		
		return date;
	}
}