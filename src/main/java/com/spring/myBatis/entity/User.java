package com.spring.myBatis.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    @NotBlank(message = "Enter valid username!")
    private String name;

    @Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message = "Enter a valid email!")
    private String email;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Past(message = "Date of Birth must be in past!!")
    private LocalDate dob;
}
