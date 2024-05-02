package com.example.Student_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
