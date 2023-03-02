package com.student.services;

import java.util.List;

import com.student.model.Student;


public interface StudentServices {

	Student create(Student student);

	Student read(Long id);

	String delete(Long id);

	List<Student> readAll();

	

	Student updateStudent(Long id, Student student);

}
