package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.memo;

import java.util.List;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.MemoDto;

public interface MemoService {
	
	// get the memos of a customer
	
	List<MemoDto> getCustomerMemos(Long customerId);
	
	// create a new memo

	MemoDto createMemo(MemoDto memoDto);
	
	// delete a memo

	void deleteMemo(Long id);
}