package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2ValueController {
	@Value("${greeting.message}")
	private String msg;
	
	@RequestMapping("/value")
	public String getValue() {
		return msg;
	}
}
