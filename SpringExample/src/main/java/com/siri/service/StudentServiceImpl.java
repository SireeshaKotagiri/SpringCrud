package com.siri.service;

import java.util.ArrayList;
import java.util.List;

import com.siri.entity.Student;

public interface StudentServiceImpl {
	Student save(Student s);

	List<Student> getStudent();

	int getTotalSal();



	

}
