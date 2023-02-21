package com.example.demo.controller2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	String studentName="Iamneo";
	@RequestMapping("/name")
	public String getName() {
		return ("Welcome "+studentName+"!");
	}
}
