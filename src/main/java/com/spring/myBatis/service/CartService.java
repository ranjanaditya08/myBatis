package com.spring.myBatis.service;

import com.spring.myBatis.entity.CartItems;
import com.spring.myBatis.entity.Product;
import com.spring.myBatis.mappers.CartMapper;
import com.spring.myBatis.mappers.ProductMapper;
import com.spring.myBatis.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;


    public void addProductToCart(CartItems cartItems) {
        cartMapper.addProductToCart(cartItems);
    }

    public List<Product> getUserSpecificCartItems(int userId){
       List<Product> products = cartMapper.getUserSpecificCartItems(userId);
       return products;
    }
}
