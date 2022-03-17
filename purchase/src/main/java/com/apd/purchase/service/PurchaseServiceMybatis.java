package com.apd.purchase.service;

import com.apd.purchase.core.PurchaseCore;
import com.apd.purchase.dao.RPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class PurchaseServiceMybatis {

    @Autowired
    private RPurchaseRepository rPurchaseRepository;

    public List<PurchaseCore> getAllPurchase() {
        return rPurchaseRepository.getAllPurchases();
    }

    public PurchaseCore savePurchaseMybatis(PurchaseCore purchaseCore) {
        purchaseCore.setPurchaseTime(ZonedDateTime.now());
        return rPurchaseRepository.savePurchaseMybatis(purchaseCore);
    }
}
