package com.example.demo.controller3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ColorController {
	String color="Green";
	
	@RequestMapping("/color")
	public String getColor() {
		return ("My favorite color is "+color);
	}
}
