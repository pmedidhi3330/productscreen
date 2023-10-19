package com.product.productscreen.repository;

import com.product.productscreen.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


    public ProductEntity findByProductNameAndPriceRange(String productName, int priceRange);
}
