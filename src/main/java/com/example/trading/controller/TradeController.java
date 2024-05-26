package com.example.trading.controller;

import com.example.trading.entity.Trade;
import com.example.trading.request.TradeRequest;
import com.example.trading.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    /*//TODO: Field injection is not recommended
    @Autowired*/
    private final TradeService tradeService;

    public TradeController(@Autowired TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @PostMapping("/execute")
    public ResponseEntity<Trade> executeTrade(@RequestBody TradeRequest request) {
        Trade trade = tradeService.executeTrade(request.getUser(), request.getBond(), request.getSwap(), request.getAmount());
        return ResponseEntity.ok(trade);
    }

    //TODO: reason for needing executeAsync
    @PostMapping("/executeAsync")
    public ResponseEntity<Future<Trade>> executeTradeAsync(@RequestBody TradeRequest request) {
        Future<Trade> tradeFuture = tradeService.executeTradeAsync(request.getUser(), request.getBond(), request.getSwap(), request.getAmount());
        return ResponseEntity.ok(tradeFuture);
    }

    //TODO: better practice to call getAll or leave like this?
    @GetMapping("")
    public ResponseEntity<List<Trade>> getAllTrades() {
        //TODO: error handling
        return ResponseEntity.ok(tradeService.getAll());
    }
}
