package com.spring.utility.batch;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class BatchService {
	
	/*
	  
	   [ 스프링 배치 구현 방법 ]
	  
	  
	   1) servlet-contxt.xml파일을 수정한다.
	  
		  xmlns:task="http://www.springframework.org/schema/task"			<< namespace추가
		  xmlns:util="http://www.springframework.org/schema/util"			<< namespace추가
		  
		  http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-4.3.xsd  << xsi:schemaLocation 추가
		  http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-4.3.xsd  << xsi:schemaLocation 추가
		  
		  <task:annotation-driven />										<< 태그 추가
	  
	  
	   	2) Service로직에서 @Scheduled(cron="초 분 시 일 월 요일 (연도)") 선언 후 배치를 사용한다.
	 
	*/
	
	
	/*
	 
	  [ 스프링 스케쥴러 설정 ] 
	 
	  @Scheduled(cron="1 2 3 4 5 6 (7)")
	 
	  [ 필드 ]
	  
	 	1) 초	2) 분	3) 시	4) 일	5) 월	6) 요일	  7) 연도(optional) 	
	 
	 
	  [ 표기법 ]
	  
	 	 * : 모든 경우의 수
	 	 ? : 사용하지 않음 
	 	 - : 기간
	 	 , : 복수 선택
	 	 / : 시작시간과 반복 간격 설정  
	     L : 마지막 기간
	 	 W : 가장 가까운 평일 동작
	 
	 
	   [ 샘플 예시 ]    
	    
	 	@Scheduled(cron="0 0 15 * * *")		     > 매일 15시에 실행 
 	 	@Scheduled(cron="0 30 15 * * *")		 > 매일 15시 30분에 실행 
 	  	@Scheduled(cron="* 0/15 * * * *")		 > 매일 15분 간격으로 실행 
	 	@Scheduled(cron="0 0/10 12,0 * * *") 	 > 매일 12시 , 0시에 10분 간격으로 실행 
	 	@Scheduled(cron="0 0 9-12 * * *")  		 > 매일 9시 ~ 12시 정각에 실행
	    @Scheduled(cron="0 0 0 ? * MON")	 	 > 매주 월요일 0시에 실행
	 	@Scheduled(cron="0 0 18 ? * MON-FRI")	 > 매주 월~금(평일) 18시에 실행 
	  
	 */
	
	
	@Autowired
	private BatchDAO batchDAO;
	@Scheduled(cron="0 0 5 * * *")
	public void getProductList() throws Exception {
		
		List<Map<String,Object>> productList = batchDAO.selectListProduct();
		
		for(Map<String,Object> map : productList) {
			System.out.println(map);
		}
		System.out.println();
	}
	
	
	
	@Scheduled(cron="0 0 6 * * *") //10초랑 20초에 한 번씩 실행
	public void getBrandList() throws Exception {
		
		List<Map<String,Object>> brandList = batchDAO.selectListBrand();
		
		for(Map<String,Object> map : brandList) {
			System.out.println(map);
		}
		System.out.println();
	}
	
	
	
}
