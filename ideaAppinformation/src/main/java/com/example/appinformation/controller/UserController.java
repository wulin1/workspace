package com.example.appinformation.controller;

import com.example.appinformation.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 前端控制器类，调用业务层方法处理请求
 * @author Administrator
 *
 */
@Controller
@ComponentScan({"SpringBoot_jsp.springbootJsp.service"})
@MapperScan("SpringBoot_jsp.springbootJsp.mapper")
public class UserController {
	
	@Resource
	private UserService  userService;

	@RequestMapping("/index")
	public String findById(HttpServletRequest request){

		return "index";
	}
	
	@RequestMapping("/backendlogin")
	public String backendlogin(HttpServletRequest request){

		return "backendlogin";
	}
	@RequestMapping("/devlogin")
	public String devlogin(HttpServletRequest request){

		return "devlogin";
	}
}
