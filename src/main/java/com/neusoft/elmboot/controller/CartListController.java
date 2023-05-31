package com.neusoft.elmboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;

@RestController
@RequestMapping("/CartListController")
public class CartListController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/saveCart")
	public int saveCart(Cart cart) {
		return cartService.saveCart(cart);
	}
	
	@RequestMapping("/updateCart")
	public int updateCart(Cart cart) {
		return cartService.updateCart(cart);
	}
	
	@RequestMapping("/removeCart")
	public int removeCart(Cart cart) {
		return cartService.removeCart(cart);
	}
	
	@RequestMapping("/listCart")
	public List<Cart> listCart(Cart cart) {
		return cartService.listCart(cart);
	}

}
