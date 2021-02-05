package com.xworkz.event;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.event.custom.Player;
import com.xworkz.event.custom.Speaker;
import com.xworkz.event.custom.Sport;

public class InitTester {

	public static void main(String[] args) {

		
		ApplicationContext container=new ClassPathXmlApplicationContext("fw/spring.xml");
		
		System.out.println(container.getBeanDefinitionCount());
		
		//Player player=new Player("Virat");
		String[] beanNames=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Player player=container.getBean(Player.class);
		player.displayDetails();
		
		Sport refOfSport=container.getBean(Sport.class);
		refOfSport.displayDetails();
		
		Speaker refOfSpeaker=container.getBean(Speaker.class);
		System.out.println(refOfSpeaker);
		
	}

}
