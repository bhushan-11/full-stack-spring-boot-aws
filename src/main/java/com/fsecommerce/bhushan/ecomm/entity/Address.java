package com.fsecommerce.bhushan.ecomm.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String street;

    private String city;

    private String state;

    private String zipcode;

    private String country;

    @ManyToOne (fetch =  FetchType.LAZY)
    @JoinColumn (name= "user_id")
    private User user;

    private final LocalDateTime createdAt = LocalDateTime.now();


}
