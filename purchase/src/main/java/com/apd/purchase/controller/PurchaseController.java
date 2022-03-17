package com.apd.purchase.controller;

import com.apd.purchase.core.PurchaseCore;
import com.apd.purchase.model.Purchase;
import com.apd.purchase.service.PurchaseService;
import com.apd.purchase.service.PurchaseServiceMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase") //pre-path
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private PurchaseServiceMybatis purchaseServiceMybatis;

    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}") //api/purchase/{userId}
    public ResponseEntity<?> getAllPurchaseOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchase() {
        return ResponseEntity.ok(purchaseServiceMybatis.getAllPurchase());
    }

    @PostMapping("/mybatis")
    public ResponseEntity<?> savePurchaseMybatis(@RequestBody PurchaseCore purchaseCore) {
        return ResponseEntity.ok(purchaseServiceMybatis.savePurchaseMybatis(purchaseCore));
    }

}
