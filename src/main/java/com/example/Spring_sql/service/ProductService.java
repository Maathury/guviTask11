package com.example.Spring_sql.service;


import com.example.Spring_sql.dto.ProductDto;
import java.util.List;

public interface ProductService {

    void addProductDetails(ProductDto productDto);
    List<ProductDto> getAllPrductsDetails();
}
