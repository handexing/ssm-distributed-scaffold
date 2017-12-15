package com.ssm.distributed.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("getUserById/{id}")
	public String getUser(@PathVariable("id") Long id) {
		return "hahhah";
	}

}
