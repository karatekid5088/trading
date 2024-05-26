package com.example.trading.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Bond {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double interestRate;
    private LocalDate maturityDate;
    //TODO: short explanation of a Bond with an analogy
}
