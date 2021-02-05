package com.xworkz.event.custom;

public class Event {
//param vs arg ??
	public Event() {
		System.out.println("Created Event");
	}

	public void manage() {
		System.out.println("event is running");

	}

	@Override
	public String toString() {
		return "Event Class";
	}

	

}
