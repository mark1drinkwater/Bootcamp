package com.in28minutes.learnspringframework.business;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		System.out.println("Constructor Injection - BusinessCalculationService");
		this.dataService = dataService;
	}
	
	public int findMax() {
		System.out.println("In findMax - BusinessCalculationService");
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}
	
}
