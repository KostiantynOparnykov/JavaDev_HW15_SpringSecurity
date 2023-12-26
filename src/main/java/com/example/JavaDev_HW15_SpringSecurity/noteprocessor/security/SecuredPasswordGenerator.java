package com.example.JavaDev_HW15_SpringSecurity.noteprocessor.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//simple utility class for BCrypt password encrypt and console output

public class SecuredPasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "jdbcDefault";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
