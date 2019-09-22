package com.example.training.demo;

import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements StudentInterface {

	@Override
	public Student getStudetn() {
		Student s = new Student();
		s.setAge(23);
		s.setId(2);
		s.setName("narasimha");
		return s;
	}

	@Override
	public void saveStudent() {
		// TODO Auto-generated method stub
		
	}

}
