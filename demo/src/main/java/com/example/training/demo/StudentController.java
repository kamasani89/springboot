package com.example.training.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	//@Autowired
	private StudentInterface student;
	
	@GetMapping("/info")
	public ResponseEntity<Student> getStudent(){
		
		Student s = student.getStudetn();
	
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	
	@GetMapping("marks")
	public ResponseEntity<Student> getMarkes(){
	
		return new ResponseEntity<Student>(new Student(),HttpStatus.OK);
	}
	
	
	
	

}
