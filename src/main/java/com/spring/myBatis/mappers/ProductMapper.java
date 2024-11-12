package com.spring.myBatis.mappers;


import com.spring.myBatis.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    void addProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(int product_id);
}
