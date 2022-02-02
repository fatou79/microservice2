package com.fatou.microservices.limitsservice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.microservices.limitsservice3.bean.Limits;
import com.fatou.microservices.limitsservice3.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration fatou;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		//return new Limits(1,1000);
		 return new Limits(fatou.getMinimum(),fatou.getMaximum());
	}

}
