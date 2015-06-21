package com.ekebratt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/greeting")
	public String greeting() {
		return "Greetings From Rest!";
	}

}