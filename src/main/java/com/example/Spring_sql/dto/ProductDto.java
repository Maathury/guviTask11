package com.example.Spring_sql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {

    private Long productId;
    private String productName;
    private double productPrice;
    private String productCategory;
}
