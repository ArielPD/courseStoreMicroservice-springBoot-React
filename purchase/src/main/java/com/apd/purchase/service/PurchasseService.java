package com.apd.purchase.service;

import com.apd.purchase.model.Purchase;

import java.util.List;

public interface PurchasseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
