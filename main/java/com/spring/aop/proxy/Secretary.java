package com.spring.aop.proxy;

public class Secretary implements Manager {

	private Manager manager;
	
	
	public Secretary() {
		super();
	}

	public Secretary(Manager manager) {
		super();
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void signature(String fileName) {
		System.out.println("reserve signature");
		manager.signature(fileName);
		System.out.println("record signature");
	}

	public void meeting(String meetName) {
		System.out.println("reserve  meeting");
		manager.meeting(meetName);
		System.out.println("record meeting");
	}

	public void collectData() {
		System.out.println("secretary has collected data");
	}
}
