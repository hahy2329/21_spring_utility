package com.spring.utility.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tx")
public class TransactionController {

	/*
	  
	   [ 스프링 트랜잭션 구현 방법 ]
	  
	  1. AOP 기능을 적용(AOP수업 참고) 한다.
	  
	  	1-1) pom.xml파일에 aop의존성 추가
	  	<!-- AspectJ -->
		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjrt</artifactId>
			<version>${org.aspectj-version}</version>
		</dependency>	
		
		<dependency>
		   <groupId>org.aspectj</groupId>
		   <artifactId>aspectjweaver</artifactId>
		   <version>1.6.11</version>
		 </dependency>
	
	    <dependency>
		  <groupId>org.springframework</groupId>
		  <artifactId>spring-aop</artifactId>
		  <version>${org.springframework-version}</version>
	    </dependency>
	  
	    1-2) servlet-context.xml파일에 
	    xmlns:aop="http://www.springframework.org/schema/aop" 													<< namespace추가
	    
	    http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-4.3.xsd << xsi:schemaLocation에 추가
	  
	  	<aop:aspectj-autoproxy /> 																				<< 태그 추가
	  
	  
	  2) root-context.xml파일을 수정한다.
	  	
	     xmlns:tx="http://www.springframework.org/schema/tx" 												  	<< namespace추가
	  
	  	 http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-4.3.xsd  	<< xsi:schemaLocation에 추가
	  	
		<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">  << 태그 추가
			<property name="dataSource" ref="dataSource" />
		</bean>
		
		<tx:annotation-driven />																				<< 태그 추가															
	  
	  
	  3) Service 로직에서 메서드 위에 @Transactional어노테이션 추가 후 트랜잭션을 구현한다.
	  
	*/
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/addAccountTransfer" , method=RequestMethod.GET)
	public String addAccountTransfer() throws Exception {
		transactionService.addAccountTransfer();
		return "home";
	}
	
	
	@RequestMapping(value="/addOrder" , method=RequestMethod.GET)
	public String addOrder() throws Exception {
		transactionService.addOrder();
		return "home";
	}
	
}
