package com.spring.aop;

import com.spring.aop.proxy.Manager;
import com.spring.aop.proxy.ManagerImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo2 {

	
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop1.xml");
		Manager manager = (Manager) ac.getBean("manager");
		manager.signature("任命书");
		manager.meeting("周例会");
	}

	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop2.xml");
		Manager manager = (Manager) ac.getBean("manager");
		manager.signature("任命书");
		manager.meeting("周例会");
	}
}
