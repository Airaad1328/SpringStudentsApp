package com.gmail.clarkin200.springstudent.service.impl;

import com.gmail.clarkin200.springstudent.model.Student;
import com.gmail.clarkin200.springstudent.repository.inMemoryStudentsDAO;
import com.gmail.clarkin200.springstudent.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {

    private final inMemoryStudentsDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudents(Student student) {
        return repository.saveStudents(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
