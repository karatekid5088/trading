package com.example.trading.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Bond bond;
    @ManyToOne
    private InterestRateSwap swap;
    private Double amount;
    private LocalDate tradeDate;
    //TODO: short explanation of a Trade with an analogy
}
