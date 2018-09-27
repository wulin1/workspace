package com.example.appinformation.service;

import com.example.appinformation.mapper.UserMapper;
import com.example.appinformation.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 业务层实现类
 * @author Administrator
 *
 */

@Service("userService")
@ComponentScan({"SpringBoot_jsp.springbootJsp.mapper"})
public class UserService implements UserIService {

	@Resource 
	private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
		
	}

	@Override
	public void edit(User user) {
		userMapper.edit(user);		
	}

	@Override
	public User find(int id) {
		return userMapper.find(id);
	}

}
