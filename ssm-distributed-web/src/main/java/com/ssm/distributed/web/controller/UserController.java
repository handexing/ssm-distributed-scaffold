package com.ssm.distributed.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.distributed.api.service.UserDao;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("getUserById/{id}")
	public String getUser(@PathVariable("id") Long id) {
		return userDao.getById(id).getName();
	}

}
