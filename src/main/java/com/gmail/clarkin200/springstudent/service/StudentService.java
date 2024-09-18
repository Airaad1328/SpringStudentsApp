package com.gmail.clarkin200.springstudent.service;

import com.gmail.clarkin200.springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudents();

    Student saveStudents(Student student);

    Student findStudentByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}
