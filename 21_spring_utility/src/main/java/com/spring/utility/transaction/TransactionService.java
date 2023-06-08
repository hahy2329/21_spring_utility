package com.spring.utility.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	private TransactionDAO transactionDAO;
	
	@Transactional //성공을 하던가 아니면 실패를 하던가 끝맺음을 지어야 한다. 중간 오류나면 아무일도 일어나면 안된다.
	public void addAccountTransfer() throws Exception {
		transactionDAO.updateSendMoney();
		System.out.println(1/0); 	// 문제 발생
		transactionDAO.updateRecvMoney();
	}
	
	@Transactional
	public void addOrder() throws Exception {
		transactionDAO.updatePoint();
		transactionDAO.updateCartCnt();
		System.out.println(1/0);	// 문제 발생
		transactionDAO.updateOrderCnt();
	}
	
	
	
}
