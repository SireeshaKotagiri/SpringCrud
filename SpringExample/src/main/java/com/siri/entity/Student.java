package com.siri.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity

public class Student {
	@Id
	private int id;
	private String name;
	private String address;
	private int age;
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Student(int id, String name, String address, int age, int salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary
				+ ", dept=" + dept + "]";
	}
	
	
	

}
