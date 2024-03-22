package com.example.minibankingproductservice.repository;

import com.example.minibankingproductservice.entity.BankProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankProductRepository extends JpaRepository<BankProduct, Long> {
}
