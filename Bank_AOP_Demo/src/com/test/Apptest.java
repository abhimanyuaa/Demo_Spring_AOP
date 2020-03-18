package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Account;

public class Apptest {

	
	public static void main(String[] args) {
		
	ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring.xml");
	
	Account account= (Account) context.getBean("ac",Account.class);
		
	//account.withdraw();
	
	account.deposite();
		
	}
}
