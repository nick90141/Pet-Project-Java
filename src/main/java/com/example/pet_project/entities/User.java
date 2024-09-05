package com.example.pet_project.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotEmpty(message = "Поле \"Ім'я\" має бути заповнене")
    @Size(min = 2, max = 30)
    @Column (name = "name")
    private String name;

    @NotEmpty(message = "Поле \"Прізвище\" має бути заповнене")
    @Size(min = 2, max = 30)
    @Column(name = "surname")
    private String surname;

    @NotEmpty(message = "Поле \"Phone\" має бути заповнене")
    @Size(min = 5, max = 100)
    @Column(name = "phone", unique = true)
    private String phone;

    @NotEmpty(message = "Поле \"Email\" має бути заповнене")
    @Size(min = 5, max = 80)
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty(message = "Поле \"Пароль\" має бути заповнене")
    @Size(min = 5, max = 100)
    @Column(name = "password")
    private String password;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}