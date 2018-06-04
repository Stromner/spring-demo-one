package com.luv2code.springdemo;

public class BikeCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BikeCoach() {
		System.out.println("BikeCoach: inside no-arg constructor");
	}
	
	public BikeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BikeCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bike 40k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
