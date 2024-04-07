package org.example.productservice.controllers;

import org.example.productservice.dtos.FakeStoreProductDto;
import org.example.productservice.services.FakeStoreProductService;
import org.example.productservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController
{
    private ProductService productService;
    ProductController(FakeStoreProductService fakeStoreProductService)
    {
        this.fakeStoreProductService = fakeStoreProductService;
    }
    @GetMapping("/{id}")
    public FakeStoreProductDto getProductById(@PathVariable("id") long id)
    {
        return null;
    }
}
