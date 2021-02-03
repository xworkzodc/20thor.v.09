package com.xworkz.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.event.custom.Event;

public class SpringTester {

	public static void main(String[] args) {

//STEP 1 
		// create and init spring
		String metaInfoFile="fw/spring.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(metaInfoFile);
		
		Event event=spring.getBean(Event.class);
		
		event.manage();
	}

}
