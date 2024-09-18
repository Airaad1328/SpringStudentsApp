package com.gmail.clarkin200.springstudent.controller;

import com.gmail.clarkin200.springstudent.model.Student;
import com.gmail.clarkin200.springstudent.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentConroller {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {
        /* todo */
        return studentService.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudents(student);
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return studentService.findStudentByEmail(email);
    }

    @PutMapping("update_students")
    public Student updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_students/{email}")
    public void deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
    }
}
