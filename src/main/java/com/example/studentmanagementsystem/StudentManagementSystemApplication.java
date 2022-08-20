package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    
    @Override
    public void run(String... args) throws Exception {
        //this for adding new data in mysql database
        /*Student student = new Student("Fazal", "Haroon", "fazal@gmail.com");
        studentRepository.save(student);

        Student student1 = new Student("adnan", "arif", "adnan@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("faisal", "shah", "shah@gmail.com");
        studentRepository.save(student2);*/
    }
}
