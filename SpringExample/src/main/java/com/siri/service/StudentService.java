package com.siri.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siri.entity.Student;
import com.siri.repository.StudentRepository;
@Service
public class StudentService implements StudentServiceImpl{
	
	@Autowired
	private StudentRepository sRepository;


	@Override
	public Student save(Student s) {
		
			
		return sRepository.save(s);

		}
		
	@Override
	public List<Student> getStudent() {
		List<Student> packageEntityList = sRepository.findAll();
		return packageEntityList;
	}

	@Override
	public int getTotalSal() {
		List<Student> s = sRepository.findAll();
		int total = s.stream().collect(
				   Collectors.summingInt(Student::getSalary));
				  System.out.println("Total Employees Salary : " + total);
				  ArrayList<Integer> list = IntStream.of(total)
                          .boxed()
                          .collect(Collectors.toCollection(ArrayList::new));
				return total;
//		return s.stream()
//	            .filter(i -> i > 5)
//	            .mapToInt(i -> i)
//	            .sum();
//				 }
	}
}

	


