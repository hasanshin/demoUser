package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MyUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String forname;
    private String lastname;
    private String email;
    private int age;


}
