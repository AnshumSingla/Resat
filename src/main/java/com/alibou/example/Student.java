package com.alibou.example;

import jakarta.persistence.*;

@Entity
@Table(name = "T_Student")
public class Student {

    @Id
    @GeneratedValue //can be used only for primary keys
    private Integer id;
    @Column(
            name = "c_fname",
            length = 20
    )
    private String firstName;
    private String lastName;
    private Integer age;
    @Column(unique = true)
    private String email;
    @Column(updatable = false, insertable = false)
    private String someColumn;

    public Student() {
    }

    public Student(String firstName, String lastName, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
}
