package com.ssm.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.distributed.api.entity.User;
import com.ssm.distributed.api.service.UserDao;

public class TestUserDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		UserDao userdao = (UserDao) context.getBean("userService");
		User user = userdao.getById(1L);
		System.out.println(user.getName()+"&&&&&&&&&&&&&&&&&");
	}
}
