package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Customer")
public class CustomerImpl implements Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	protected CustomerImpl() {} // for JPA only
	
	public CustomerImpl(String name) {
		
		this.name = name;
	}

	@Override
	public Long getId() {
		
		return id;
	}

	@Override
	public String getName() {
		
		return name;
	}
}