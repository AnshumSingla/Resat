package com.alibou.example;

public record StudentDto(
        String firstname,
        String lastname,
        Integer age,
        String email,
        Integer schoolId
) {
}
