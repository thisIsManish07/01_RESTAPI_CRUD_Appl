package com.manishit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manishit.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
  
}
