package com.xworkz.event.custom;

public class Alarm {

	private double price;
	private String brand;
	private boolean underWarranty;

	public Alarm(double price, String brand) {
		super();
		System.out.println("double and string");
		this.price = price;
		this.brand = brand;
	}

	public Alarm(String brand, double price) {
		super();
		System.out.println("string and double");
		this.price = price;
		this.brand = brand;
	}

	public void setUnderWarranty(boolean underWarranty) {
		this.underWarranty = underWarranty;
	}

}
