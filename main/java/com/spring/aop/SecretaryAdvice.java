package com.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class SecretaryAdvice {
	

	
	/**
	 * pointCut
	 */
	@Pointcut("execution(* *.meeting(..))")
	public void pointCut1() {};

	/**
	 * pointCut
	 */
	@Pointcut("within(com.spring.aop.proxy.*)")
	public void pointCut2() {};

	/**
	 * pointCut
	 */
	@Pointcut("execution(* com.spring.aop.proxy.Manager.*(..))")
	public void pointCut3() {};

	@After("pointCut3()")
	public void record(JoinPoint jointPoint) {
		System.out.println("record:"+jointPoint.getSignature().getName());
	}
	

	@Before("pointCut3()")
	public void reserve(JoinPoint jointPoint) {
		System.out.println("reserve:"+jointPoint.getSignature().getName());
	}
	
	
}
