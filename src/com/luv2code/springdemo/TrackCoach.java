package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("Normal init method running");
		this.fortuneService = fortuneService;
	}
	
	public void customInit() {
		System.out.println("Custom init method running");
	}
	
	public void customDestroy() {
		System.out.println("Custom destroy method running");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
