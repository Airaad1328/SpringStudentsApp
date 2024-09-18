package com.gmail.clarkin200.springstudent.repository;

import com.gmail.clarkin200.springstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    void deleteByEmail(String email);

    Student findByEmail(String email);
}
