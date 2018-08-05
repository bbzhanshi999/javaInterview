package com.spring.aop.proxy;

import org.junit.Test;

public class Demo1 {
	
	@Test
	public void test1() {
		Manager manager = new ManagerImpl();
		Secretary secretary = new Secretary(manager);
		secretary.meeting("周会");
		secretary.signature("任命书");
	}
	
	@Test
	public void dynamicProxy() {
		Manager manager = new ManagerImpl();
		ProxyManager proxyManager = new ProxyManager(manager);
		Manager proxyInstance = proxyManager.getProxyInstance();
		proxyInstance.meeting("周会");
		proxyInstance.signature("任命书");
		System.out.println(proxyInstance instanceof Manager);
	}
}
