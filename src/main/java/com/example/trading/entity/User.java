package com.example.trading.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    //TODO: find more secure way of handling this
    private String password;
    private String role;
}
