package com.fsecommerce.bhushan.ecomm.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data

@Entity
@Table(name = "reviews")
public class Review {



    private Long id ;

    private String content;

    private int rating;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")

    private Product product;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();


}
