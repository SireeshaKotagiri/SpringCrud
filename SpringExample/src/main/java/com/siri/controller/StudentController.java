package com.siri.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siri.entity.Student;
import com.siri.service.StudentServiceImpl;
@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl iStudent;
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {

		return iStudent.save(student);
	}

	@GetMapping("/getStudents")
	public List<Student> findAll() {
		
		return iStudent.getStudent();
	}
	@GetMapping("/getTotal")
	public int findAllBySalary() {
		
		return iStudent.getTotalSal();
	}
	

	

}
