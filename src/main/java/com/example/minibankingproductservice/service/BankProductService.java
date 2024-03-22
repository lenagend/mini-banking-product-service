package com.example.minibankingproductservice.service;

import com.example.minibankingproductservice.entity.BankProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.minibankingproductservice.repository.BankProductRepository;

import java.util.List;

@Service
public class BankProductService {

    @Autowired
    private BankProductRepository bankProductRepository;

    public BankProduct createProduct(BankProduct product) {
        // 상품 생성 로직
        return bankProductRepository.save(product);
    }

    public BankProduct getProductById(Long id) {
        // ID로 상품 조회 로직
        return bankProductRepository.findById(id).orElse(null);
    }

    public List<BankProduct> getAllProducts(){
        return bankProductRepository.findAll();
    }
}
