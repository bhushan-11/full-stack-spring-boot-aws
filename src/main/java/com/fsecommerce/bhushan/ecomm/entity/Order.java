package com.fsecommerce.bhushan.ecomm.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity

@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;

    private BigDecimal totalprice ;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItemList;

    private final LocalDateTime createdAt = LocalDateTime.now();
}
