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
@ComponentScan({"com.example.appinformation.mapper"})
public class UserService implements UserIService {
	@Resource
	private UserMapper userMapper;

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	@Override
	public User find(String username, String password) {

		return userMapper.find(username,password);
	}

}
