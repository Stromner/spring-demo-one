package com.luv2code.springdemo.demos;

import com.luv2code.springdemo.BikeCoach;
import com.luv2code.springdemo.Coach;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new BikeCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
