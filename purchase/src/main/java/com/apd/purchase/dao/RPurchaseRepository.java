package com.apd.purchase.dao;

import com.apd.purchase.core.PurchaseCore;
import com.apd.purchase.util.exception.RepositoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RPurchaseRepository {

    public static final int MAX_PAGE_SIZE = 1000;

    @Autowired
    MPurchaseMapper mapper;

    public List<PurchaseCore> getAllPurchases() throws RepositoryException {
        return mapper.getAllPurchases();
    }

    public PurchaseCore savePurchaseMybatis(PurchaseCore purchaseCore) throws RepositoryException {
        mapper.savePurchaseMybatis(purchaseCore);
        return purchaseCore;
    }
}

