package ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.service.memo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.Memo;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.model.memo.MemoDto;
import ch.zli.m223.ksh17a.jan_gehbauer.customer_memos.repository.memo.MemoRepository;

@Service
public class MemoServiceImpl implements MemoService {
	
	@Autowired
	MemoRepository memoRepository;
	
	@Override
	public List<MemoDto> getCustomerMemos(Long customerId) {
		
		List<Memo> oldList;
		List<MemoDto> newList;
		
		oldList = memoRepository.findMemoByCustomerId(customerId);
		
		newList = new ArrayList<>();
		
		for (Memo user : oldList) {
			newList.add(new MemoDto(user));
		}
		
		return newList;
	}

	@Override
	public MemoDto createMemo(MemoDto memoDto) {
		
		return new MemoDto(memoRepository.createMemo(memoDto.customerId, memoDto.note, memoDto.date));
	}

	@Override
	public void deleteMemo(Long id) {
		
		memoRepository.deleteById(id);
	}
}