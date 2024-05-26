package com.example.trading.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class InterestRateSwap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double notionalAmount;
    private Double fixedRate;
    private Double floatingRate;
    private LocalDate startDate;
    private LocalDate endDate;
    //TODO: short explanation of an InterestRateSwap with an analogy
    //TODO: does lombok have a performance penalty?
}
