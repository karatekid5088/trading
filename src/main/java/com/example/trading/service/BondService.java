package com.example.trading.service;

import com.example.trading.entity.Bond;
import com.example.trading.repository.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BondService {

    private final BondRepository bondRepository;

    public BondService(@Autowired BondRepository bondRepository) {
        this.bondRepository = bondRepository;
    }

    public List<Bond> getAllBonds() {
        return bondRepository.findAll();
    }
}
