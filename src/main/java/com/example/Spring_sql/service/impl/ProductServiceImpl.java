package com.example.Spring_sql.service.impl;

import com.example.Spring_sql.dto.ProductDto;
import com.example.Spring_sql.entity.Product;
import com.example.Spring_sql.repository.ProductRepository;
import com.example.Spring_sql.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ModelMapper modelMapper;
    private ProductRepository productRepository;

    @Override
    public void addProductDetails(ProductDto productDto) {
        Product product=modelMapper.map(productDto, Product.class);
        productRepository.save(product);
    }

    @Override
    public List<ProductDto> getAllPrductsDetails() {
        List<Product> productList=productRepository.findAll();
        return productList.stream().map(product -> modelMapper.map(product,ProductDto.class)).collect(Collectors.toList());
    }
}
