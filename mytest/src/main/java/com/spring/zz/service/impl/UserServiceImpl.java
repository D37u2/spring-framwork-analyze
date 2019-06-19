package com.spring.zz.service.impl;

import com.spring.zz.entity.UserEntity;
import com.spring.zz.service.IUserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: zhoujiong
 * @description: TODO
 * @className: UserServiceImpl
 * @date: 2019/6/15 17:01
 */
@Component("userService")
public class UserServiceImpl implements IUserService {

	public UserServiceImpl(){
		System.out.println("UserServiceImpl 构造");
	}

	@PostConstruct
	public void init(){
		System.out.println("UserServiceImpl init");
	}

	@PreDestroy
	public void destory(){
		System.out.println("UserServiceImpl destory");
	}
	@Override
	public UserEntity query() {

		return null;
	}
}
