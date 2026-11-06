package com.example.jav102fa26sd22101.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Long id;
    private String name;
    private String email;
    private String phone;
}
