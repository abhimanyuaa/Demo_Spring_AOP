package com.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Message {

	@After("execution (public void withdraw())")
	public void sendmsgwithdraw() {
		System.out.println("msg for ammount withdraw");
	}

	@Before("execution (public void deposite())")
	public void sendmsgdeposite() {
		System.out.println("msg for Deposite");
	}

}
