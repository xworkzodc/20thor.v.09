package com.xworkz.event;

import com.xworkz.event.custom.Event;

public class EventTester {

	public static void main(String[] args) {

		Event event=new Event();
		System.out.println(event);
		event.manage();
		
		event.manage();
		
		
		event.manage();
		event.manage();
		
		
	}

}
