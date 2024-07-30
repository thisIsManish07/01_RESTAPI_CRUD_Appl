package com.manishit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer rollNo;
  @Column
  private String name;
  @Column
  private Float percentage;
  @Column
  private String branch;
  
  /*public Student()
  {
	  
  }*/
  
  
public Student(String name, Float percentage, String branch) {
	super();
	this.name = name;
	this.percentage = percentage;
	this.branch = branch;
}

/*
public Integer getRollNo() {
	return rollNo;
}
public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Float getPercentage() {
	return percentage;
}
public void setPercentage(Float percentage) {
	this.percentage = percentage;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch + "]";
}*/
}
