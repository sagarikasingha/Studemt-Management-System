package com.example.Student_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Student_Management.entity.Student;
import com.example.Student_Management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 =new Student("Sagarika","Singha","saga@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 =new Student("Nisha","Singha","nisha@gmail.com");
//		studentRepository.save(student2);
		
		
	}
	
	
		

	
}
 