package com.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyManager {
	
	public Manager target;

	public ProxyManager(Manager target) {
		super();
		this.target = target;
	}
	
	
	public Manager getProxyInstance() {
		return (Manager) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("reserve "+method.getName());
						Object result = method.invoke(target, args);
						System.out.println("record "+method.getName());
						return result;
					}
				});
	}
	
}
