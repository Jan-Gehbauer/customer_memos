package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.MemoImpl;

@Entity(name = "Customer")
public class CustomerImpl implements Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(
		mappedBy = "customer",
		cascade = CascadeType.REMOVE,
		fetch = FetchType.EAGER
	)
	private List<MemoImpl> memos;
	
	// for JPA only
	
	public CustomerImpl() {
		
		memos = new ArrayList<>();
	}
	
	public CustomerImpl(String name) {
		
		this();
		
		this.name = name;
	}
	
	public CustomerImpl(Customer customer) {
		
		this();
		
		id = customer.getId();
		
		name = customer.getName();
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