package com.fsecommerce.bhushan.ecomm.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fsecommerce.bhushan.ecomm.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {



    private Long id ;

    private String name ;

    private String description;

    private String imageurl ;


    private CategoryDto category;



    private LocalDateTime createdAt ;

}
