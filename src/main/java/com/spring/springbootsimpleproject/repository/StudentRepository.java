package com.spring.springbootsimpleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springbootsimpleproject.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
