package com.example.appinformation.service;

import com.example.appinformation.pojo.User;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface UserIService {

	User find(String username, String password);
}
