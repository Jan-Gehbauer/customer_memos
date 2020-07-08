package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.repository.memo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.customer.CustomerImpl;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.Memo;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.MemoImpl;

public interface MemoRepository extends JpaRepository<MemoImpl, Long> {
	
	List<Memo> findMemoByCustomerId(Long customerId);
	
	public default Memo createMemo(Customer customer, String note) {
		
		return save(new MemoImpl(new CustomerImpl(customer), note));
	}
}