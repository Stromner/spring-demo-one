package com.luv2code.springdemo;

import java.time.Instant;

public class RandomFortuneService implements FortuneService{
	private String[] fortunes = {"Fortune1", "Fortune2", "Fortune3"};
	
	@Override
	public String getFortune() {
		return fortunes[Instant.now().getNano()%fortunes.length];
	}

}
