package com.spring.myBatis.service;


import com.spring.myBatis.entity.Product;
import com.spring.myBatis.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public void addProduct(Product product){
        productMapper.addProduct(product);
    }

    public List<Product> getAllProduct() {
        return productMapper.getAllProduct();
    }
}
