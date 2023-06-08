package com.spring.utility.batch;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BatchDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Map<String,Object>> selectListProduct() throws Exception{
		return sqlSession.selectList("batch.selectListProduct");
	}
	public  List<Map<String,Object>> selectListBrand() throws Exception{
		return sqlSession.selectList("batch.selectListBrand");
	}
	
}