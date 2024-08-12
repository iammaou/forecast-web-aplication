package com.example.forecast.Forecast.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Firstname required.")
    private String firstName;
    @NotNull(message = "Lastname required.")
    private String lastName;
    @Email
    @NotNull(message = "E-mali required.")
    private String email;
    @NotNull(message = "Password required.")
    private String password;
}
