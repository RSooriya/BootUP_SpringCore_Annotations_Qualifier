package com.sooriya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Qualifier used above field - field injection 
@Component
public class BaseballCoach implements Coach {

	@Autowired
    @Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
