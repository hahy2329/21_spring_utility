package com.spring.utility.transaction;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void updateSendMoney() throws Exception{
		sqlSession.update("tx.updateSendMoney");
	}
	public void updateRecvMoney() throws Exception{
		sqlSession.update("tx.updateRecvMoney");
	}
	
	public void updatePoint() throws Exception{
		sqlSession.update("tx.updatePoint");
	}
		
	public void updateCartCnt() throws Exception{
		sqlSession.update("tx.updateCartCnt");
	}
	
	public void updateOrderCnt() throws Exception{
		sqlSession.update("tx.updateOrderCnt");
	}
	
	
}
