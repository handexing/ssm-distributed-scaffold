package com.ssm.distributed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.distributed.api.entity.User;
import com.ssm.distributed.api.service.UserDao;
import com.ssm.distributed.service.mapper.UserMapper;

@Service("userDao")
public class UserService implements UserDao{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getById(Long id) {
		return userMapper.getById(id);
	}

}
