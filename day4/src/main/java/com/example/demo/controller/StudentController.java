package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Boolean create(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> get(){
		return service.getStudent();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/student")
	public Boolean delete(@RequestParam int id) {
		return service.deleteStudentById(id);
	}
	
	@PutMapping("/student/{id}")
	public Student update(@PathVariable int id,@RequestBody Student student ) {
		return service.updateStudentById(student);
	}
}
