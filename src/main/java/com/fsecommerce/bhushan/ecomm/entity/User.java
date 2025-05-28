package com.fsecommerce.bhushan.ecomm.entity;


import com.fsecommerce.bhushan.ecomm.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

@NotBlank(message = "name is required")
    private String name;


    @NotBlank(message =  "password is required")
    private String password;

    @Column(unique = true)
    @NotBlank(message = "email is required ")
    private String email ;

    @Column(name = "phone_number")
    @NotBlank(message = "phone number is required")
    private String phoneNumber;


    private UserRole role ;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList;

    @OneToOne (fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    private Address address;

    @Column(name = "created_at")
    private final LocalDateTime createdAt =LocalDateTime.now();

}
