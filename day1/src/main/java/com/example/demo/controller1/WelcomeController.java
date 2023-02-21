package com.example.demo.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	@RequestMapping("/")
	public String getMessage() {
		return "Welcome String Boot";
	}

}
