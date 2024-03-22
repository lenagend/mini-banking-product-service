package com.example.minibankingproductservice.controller;

import com.example.minibankingproductservice.entity.BankProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.minibankingproductservice.service.BankProductService;

import java.util.List;

@RestController
@RequestMapping("/bank-products")
@CrossOrigin
public class BankProductController {

    @Autowired
    private BankProductService bankProductService;

    @PostMapping
    public ResponseEntity<BankProduct> createProduct(@RequestBody BankProduct product) {
        BankProduct createdProduct = bankProductService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankProduct> getProductById(@PathVariable Long id) {
        BankProduct product = bankProductService.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    // 전체 상품 목록 조회
    @GetMapping
    public ResponseEntity<List<BankProduct>> getAllProducts() {
        List<BankProduct> products = bankProductService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    // 기타 엔드포인트 구현
}
