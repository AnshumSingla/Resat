package com.alibou.example.Student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty
        String firstName,
        @NotEmpty
        String lastName,
        @Email(message = "Enter a valid email address")
        String email,
        Integer schoolId
) {
}
