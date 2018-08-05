package com.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



public class SecretaryAdvice2 {

	public void pointCut3() {};

	public void record(JoinPoint jointPoint) {
		System.out.println("record:"+jointPoint.getSignature().getName());
	}
	

	public void reserve(JoinPoint jointPoint) {
		System.out.println("reserve:"+jointPoint.getSignature().getName());
	}
	
	
}
