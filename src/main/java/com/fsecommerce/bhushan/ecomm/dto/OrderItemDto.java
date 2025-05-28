package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fsecommerce.bhushan.ecomm.entity.Order;
import com.fsecommerce.bhushan.ecomm.entity.Product;
import com.fsecommerce.bhushan.ecomm.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {


    private Long id ;

    private int quantity;

    private BigDecimal price ;


    private LocalDateTime createdAt;


    private UserDto user;



    private ProductDto product;


    private OrderDto order;
}
