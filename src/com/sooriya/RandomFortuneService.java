package com.sooriya;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    
	
	private String[] data = {"Today is fortune day" , "Stay healthy" , "Find friends"};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
