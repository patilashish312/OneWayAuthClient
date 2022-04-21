package com.spr.boot2.OneWayAuthClient.OneWayAuthClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestHandler {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/test")
	public String testCurrenciesMethod() {
		return restTemplate.getForObject("https://localhost:8083/testCurrencies", String.class);
		
	}
}
