package com.xworkz.event.custom;

public class Sport {

	private String name;
	private String origin;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setOrigin(String origin) {
		System.out.println("setOrigin : "+origin);
		this.origin = origin;
	}

	public void displayDetails() {
		System.out.println("Name :" + name);
		System.out.println("Name :" + origin);

	}

}
