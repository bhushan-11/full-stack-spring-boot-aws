package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int status ;
    private String message ;

    private final LocalDateTime createdAt = LocalDateTime.now();

    private String token;

    private String role;
    private String expirationTime;

    private int totalPage;

    private long totalElements;

    private AddressDto address;

    private UserDto user;

    private List<UserDto> userlist;

    private CategoryDto categoryDto ;

    private List<CategoryDto> categorylist;

    private ProductDto product ;

    private List<ProductDto> productlist;

    private OrderItemDto orderitem;

    private List<OrderItemDto > orderlist;
}
