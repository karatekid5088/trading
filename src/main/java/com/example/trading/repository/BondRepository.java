package com.example.trading.repository;

import com.example.trading.entity.Bond;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BondRepository extends JpaRepository<Bond, Long> {}
