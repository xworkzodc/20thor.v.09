package com.xworkz.event;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.event.custom.Event;

public class SpringTester {

	public static void main(String[] args) {

//STEP 1 // Container, Bean 
		// create and init spring
		String metaInfoFile = "fw/spring.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfoFile);

		System.out.println(spring.getBeanDefinitionCount());
		// type ref
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		Event event = spring.getBean("event", Event.class);
		System.out.println(event);
		event.manage();

		String refOfString = spring.getBean("string", String.class);
		System.out.println("a" + refOfString.isEmpty());

	}

}
