package com.works.repositories;

import com.works.entities.Product;
import com.works.projections.IProCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select PRODUCT.PID, PRODUCT.TITLE as title, PRODUCT.PRICE, C.TITLE as ctitle from PUBLIC.PRODUCT\n" +
            "inner join PUBLIC.PRODUCT_CATEGORIES PC on PRODUCT.PID = PC.PRODUCT_PID\n" +
            "inner join PUBLIC.CATEGORY C on C.CID = PC.CATEGORIES_CID", nativeQuery = true)
    List<IProCat> allProCat();

}