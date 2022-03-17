package com.apd.purchase.dao;

import com.apd.purchase.core.PurchaseCore;
import com.apd.purchase.util.exception.RepositoryException;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface MPurchaseMapper {

    public List<PurchaseCore> getAllPurchases() throws RepositoryException;

    public void savePurchaseMybatis(@Param("purchaseCore") PurchaseCore purchaseCore) throws RepositoryException;
}
