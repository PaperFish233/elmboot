package com.neusoft.elmboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;

@RestController
@RequestMapping("/UserController")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/getUserByIdByPass")
    public User getUserByIdByPass(User user) {
        return userService.getUserByIdByPass(user);
    }
	
	@RequestMapping("/saveUser")
    public int saveUser(User user) {
        return userService.saveUser(user);
    }
	
	@RequestMapping("/getUserById")
    public int  getUserById(User user) {
        return userService.getUserById(user.getUserId());
    }

}
