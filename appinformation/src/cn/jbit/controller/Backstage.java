package cn.jbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jbit.biz.BackstageBiz;

/**
 * 后台控制器
 * @author 吴林
 *
 */
@Controller
@RequestMapping("/Backstage")
public class Backstage {
	@Autowired
	private BackstageBiz backstageBiz;

	
	/**
	 * 进入首页页面
	 * @return
	 */
	@RequestMapping("/index.html")
	public String index(){
		return "index";
	}
/**
 * 进入后台登录页面
 */
	@RequestMapping("/backendlogin.html")
	public String backendlogin(){
		return "backendlogin";
	}
/**
 * 登录后台后的首页
 */ 
	@RequestMapping("/main.html")
	public String main(){
		return "backend/main";
	}
	}

