package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load the Spring configurationl file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		BikeCoach bikeCoach = context.getBean("myBikeCoach", BikeCoach.class);
		
		// Call methods on the bean
		System.out.println(bikeCoach.getDailyFortune());
		System.out.println(bikeCoach.getTeam());
		System.out.println(bikeCoach.getEmailAddress());
		
		// Close context
		context.close();
	}
}
