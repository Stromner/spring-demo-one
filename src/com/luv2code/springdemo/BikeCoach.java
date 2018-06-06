package com.luv2code.springdemo;

public class BikeCoach implements Coach{
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
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
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("BikeCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setTeam(String team) {
		System.out.println("BikeCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
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
