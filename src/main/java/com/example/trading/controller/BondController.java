package com.example.trading.controller;

import com.example.trading.entity.Bond;
import com.example.trading.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bonds")
public class BondController {

    private final BondService bondService;

    public BondController(@Autowired BondService bondService) {
        this.bondService = bondService;
    }

    @GetMapping("")
    public ResponseEntity<List<Bond>> getAllBond() {
        //TODO: error handling
        return ResponseEntity.ok(bondService.getAllBonds());
    }

}
