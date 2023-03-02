package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.services.StudentServices;

@RestController
public class StudentController {
	@Autowired
	StudentServices studentServices;
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/savestudent")
	public Student create(@RequestBody Student student) {
		return studentServices.create(student);
	}
	
	@GetMapping("/byid/{id}")
	public Student read(@PathVariable("id") Long id) {
		return studentServices.read(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String delete(@PathVariable("id") Long id) {
		return studentServices.delete(id);
	}
	
	@GetMapping("/readall")
	public List readAll() {
		return studentServices.readAll();
	}
	
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		return studentServices.updateStudent(id,student);
	}
	
}
