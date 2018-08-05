package com.spring.aop.proxy;

public class ManagerImpl implements Manager {

	public void signature(String fileName) {
		System.out.println("file: "+fileName+"  manager has signed");
	}

	public void meeting(String meetName) {
		System.out.println("meeting: "+meetName+"  manager has attended");
	}

	

}
