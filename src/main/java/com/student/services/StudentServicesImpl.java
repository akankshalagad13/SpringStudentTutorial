package com.student.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
@Service
public class StudentServicesImpl implements StudentServices {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
		Student student1=studentRepository.save(student);
		return student1;
	}

	@Override
	public Student read(Long id) {
		return studentRepository.findById(id).get();
	
	}

	@Override
	public String delete(Long id) {
	studentRepository.deleteById(id);
	return "Student roll no "+id+" deleted from database";
		
	}

	@Override
	public List<Student> readAll() {
		return studentRepository.findAll();
	}


	@Override
	public Student updateStudent(Long id, Student student) {
		 Student std = studentRepository.findById(id).get();	
	     std.setFname(student.getFname());
	     std.setLname(student.getLname());
	     return studentRepository.save(std);
	}
}
