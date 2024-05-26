package com.example.trading.service;

import com.example.trading.entity.Bond;
import com.example.trading.entity.InterestRateSwap;
import com.example.trading.entity.Trade;
import com.example.trading.entity.User;
import com.example.trading.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class TradeService {

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Autowired
    private TradeRepository tradeRepository;

    @Transactional
    public Trade executeTrade(User user, Bond bond, InterestRateSwap swap, Double amount) {
        Trade trade = new Trade();
        trade.setUser(user);
        trade.setBond(bond);
        trade.setSwap(swap);
        trade.setAmount(amount);
        trade.setTradeDate(LocalDate.now());
        return tradeRepository.save(trade);
    }

    public Future<Trade> executeTradeAsync(User user, Bond bond, InterestRateSwap swap, Double amount) {
        return executorService.submit(() -> executeTrade(user, bond, swap, amount));
    }

    public List<Trade> getAll() {
        return tradeRepository.findAll();
    }
}
