package com.example.Spring_sql.controller;


import com.example.Spring_sql.dto.ProductDto;
import com.example.Spring_sql.entity.Product;
import com.example.Spring_sql.service.ProductService;
import com.example.Spring_sql.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    private ModelMapper modelMapper;

    @GetMapping("/homePage")
    public String getHomePage(){
        return "index";
    }

    @GetMapping("/addProductDetails")
    public String addProductDetails(Model model){
        ProductDto productDto=new ProductDto();
        model.addAttribute("product",modelMapper.map(productDto, Product.class));
        return "addNewProduct";
    }
    @PostMapping("/save")
    public String  saveProductDetails(@ModelAttribute("product") ProductDto productDto){
        productService.addProductDetails(productDto);
        return "redirect:/homePage";
    }
    @GetMapping("/getProductDetails")
    public String getProductDetails(Model model){
        model.addAttribute("getAllProductList",productService.getAllPrductsDetails());
        return "getProductDetails";
    }
    @GetMapping("/productList")
    public String productList(){
        return "redirect:/homePage";
    }

}
