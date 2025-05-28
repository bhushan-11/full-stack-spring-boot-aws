package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fsecommerce.bhushan.ecomm.entity.Address;
import com.fsecommerce.bhushan.ecomm.entity.OrderItem;
import com.fsecommerce.bhushan.ecomm.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private Long id;

    private String name;


    private String password;


    private String email;


    private String phoneNumber;

    private String role;


    private List<OrderItemDto> orderItemList;

    private AddressDto address;


    private LocalDateTime createdAt;

}
