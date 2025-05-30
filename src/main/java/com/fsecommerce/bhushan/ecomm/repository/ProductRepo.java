package com.fsecommerce.bhushan.ecomm.repository;

import com.fsecommerce.bhushan.ecomm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository <Product , Long>  {
List<Product> findByCategoryId (Long categoryId);

List<Product> findByNameContainigDescriptionContaining(String name, String description);



}
