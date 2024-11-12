package com.spring.myBatis.mappers;


import com.spring.myBatis.entity.CartItems;
import com.spring.myBatis.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    void addProductToCart(CartItems cartItems);

    List<Product> getUserSpecificCartItems(int user_id);
}
