package com.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long roll_no;
	
	@Column
	private String fname;
	
	@Column
	private String lname;

	public Long getRollNo() {
		return roll_no;
	}

	public void setRollNo(Long rollNo) {
		roll_no = rollNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student(Long rollNo, String fname, String lname) {
	
		this.roll_no = rollNo;
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public Student() {
		
	}

	
	

}
