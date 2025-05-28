package com.fsecommerce.bhushan.ecomm.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String namae ;

    private String description;

    private String imageurl ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;


    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();


}
