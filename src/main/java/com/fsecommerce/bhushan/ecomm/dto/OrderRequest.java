package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fsecommerce.bhushan.ecomm.entity.Payment;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {

    private BigDecimal totalPrice ;


    private List<OrderItemRequest> orderItemRequestList ;

    private Payment paymentinfo;


}
