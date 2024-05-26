package com.example.trading.request;

import com.example.trading.entity.Bond;
import com.example.trading.entity.InterestRateSwap;
import com.example.trading.entity.User;
import lombok.Data;

@Data
public class TradeRequest {
    private User user;
    private Bond bond;
    private InterestRateSwap swap;
    private Double amount;
}
