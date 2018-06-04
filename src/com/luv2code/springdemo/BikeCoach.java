package com.luv2code.springdemo;

public class BikeCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BikeCoach(FortuneService fortuneService) {
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
