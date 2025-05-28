package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data

@JsonIgnoreProperties(ignoreUnknown = true)

public class OrderItemRequest {

    private int productid;

    private int quantity ;




}
