package com.example.demo.test.aop.two.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CheckUser {
	@Pointcut("execution(* com.example.demo.test.aop.two.test.*.find*(..))")
	public void checkUser(){
		System.out.println("check user~~~~");
	}
	
	@Pointcut("execution(* com.example.demo.test.aop.two.test.*.add*(..))")
	public void checkAdd(){
		System.out.println("add user!!!");
	}
	
	
	@Before("checkUser()")
	public void beforeCheck(){
		System.out.println("������������������׼�������û�������������");
	}
	
	@After("checkUser()")
	public void afterCheck(){
		System.out.println("������������������׼�������û�������������������");
	}
	

	@Before("checkAdd()")
	public void beforeAdd(){
		System.out.println("������������������׼������û�������������");
	}
	
	@After("checkAdd()")
	public void afterAdd(){
		System.out.println("������������������׼������û�������������������");
	}
	
	@Around("checkUser()")
	public Object doAround(ProceedingJoinPoint pip) throws Throwable{
		System.out.println("���뷽�� ����֪ͨ");
		
		Object o = pip.proceed();
		System.out.println("�˳�����  ����֪ͨ");
		return o;
	}
}
