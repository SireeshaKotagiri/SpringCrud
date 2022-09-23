package com.siri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Department {
	@Id
private int did;
private String name;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department(int did, String name) {
	super();
	this.did = did;
	this.name = name;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [did=" + did + ", name=" + name + "]";
}


}
