package com.example.JavaDev_HW15_SpringSecurity.noteprocessor.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="enabled")
    private boolean enabled;
}
