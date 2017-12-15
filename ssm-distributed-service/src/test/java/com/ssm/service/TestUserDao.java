package com.ssm.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.distributed.model.User;
import com.ssm.distributed.service.mapper.UserMapper;

public class TestUserDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		UserMapper userdao = (UserMapper) context.getBean("userMapper");
		User user = userdao.getById(1L);
		System.out.println(user.getName()+"&&&&&&&&&&&&&&&&&");
	}
}
