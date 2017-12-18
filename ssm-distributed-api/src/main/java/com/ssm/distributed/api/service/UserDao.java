package com.ssm.distributed.api.service;

import com.ssm.distributed.api.entity.User;

public interface UserDao {
	
	public User getById(Long id);
	
}
