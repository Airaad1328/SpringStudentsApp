package com.gmail.clarkin200.springstudent.repository;

import com.gmail.clarkin200.springstudent.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class inMemoryStudentsDAO {

    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudents() {
        return STUDENTS;
    }

    public Student saveStudents(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student findStudentByEmail(String email) {
        return STUDENTS.stream().filter(element -> element.getEmail().equals(email)).findFirst().orElse(null);
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1) {
            STUDENTS.set(studentIndex, student);
            return student;
        }

        return null;
    }

    public void deleteStudent(String email) {

        var student = findStudentByEmail(email);
        if(student != null) {
            STUDENTS.remove(student);
        }

    }
}
