package com.gmail.clarkin200.springstudent.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {

    private String name;
    private String surname;

    private LocalDate birthDate;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    @Id
    @GeneratedValue
    private Long id;

    public int getAge (){
        return Period.between(this.birthDate,LocalDate.now()).getYears();
    }
}
