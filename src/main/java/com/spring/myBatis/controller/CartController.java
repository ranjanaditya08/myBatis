package com.spring.myBatis.controller;

import com.spring.myBatis.entity.CartItems;
import com.spring.myBatis.entity.Product;
import com.spring.myBatis.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<Void> addProductToCart(@RequestBody CartItems cartItems){
        cartService.addProductToCart(cartItems);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Product>> getUserSpecificCartItems(@PathVariable int userId){
        List<Product> products = cartService.getUserSpecificCartItems(userId);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
