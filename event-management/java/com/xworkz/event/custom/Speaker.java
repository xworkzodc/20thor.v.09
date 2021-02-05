package com.xworkz.event.custom;

public class Speaker {

	private String brand;
	private String color;
	private double price;
	private boolean bluetooth;

	public Speaker(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return "Speaker [brand=" + brand + ", color=" + color + ", price=" + price + ", bluetooth=" + bluetooth + "]";
	}

}
