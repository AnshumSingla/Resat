package com.alibou.example;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
