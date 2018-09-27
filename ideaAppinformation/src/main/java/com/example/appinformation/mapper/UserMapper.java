package com.example.appinformation.mapper;

import com.example.appinformation.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 持久层接口，定义增删改查方法
 * @author Administrator
 *
 */
@Mapper
public interface UserMapper {
	/**
	 * 登录
	 * @param id
	 * @return
	 */
	User find(String username, String password);



}
