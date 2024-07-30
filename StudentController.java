package com.manishit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.manishit.entity.Student;
import com.manishit.repository.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository repo;
	
   //Get All the Student,so we use List	
	@GetMapping("/students")
   public List<Student> getAllStudent()
   {
		List<Student> students=repo.findAll();
	   return students;
   }
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id)
	{
		Student student=repo.findById(id).get();
		return student;
	}
	
	@PostMapping("/student/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student)
	{
		repo.save(student);	
	}
	@PutMapping("/student/update/{id}")
	public Student updateStudents(@PathVariable int id)
	{
		Student student=repo.findById(id).get();
		student.setName("Avika");
		student.setBranch("B.tech");
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id)
	{
		Student student=repo.findById(id).get();
		repo.delete(student);
	}
}
