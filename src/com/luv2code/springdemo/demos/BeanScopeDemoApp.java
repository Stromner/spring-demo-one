package com.luv2code.springdemo.demos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// See if it's the same reference
		System.out.println("theCoach==alphaCoach? " + (theCoach==alphaCoach));
		System.out.println("theCoach ref:\t" + theCoach);
		System.out.println("alphaCoach ref:\t" + alphaCoach);
		
		context.close();
	}

}
