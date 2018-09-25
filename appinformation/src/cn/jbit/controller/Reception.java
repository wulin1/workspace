package cn.jbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jbit.biz.ReceptionBiz;

/**
 * 前台 控制器
 * @author吴林
 * @return
 * 
 *
 */
@Controller
@RequestMapping("/Reception")
public class Reception {
	@Autowired
	private ReceptionBiz receptionBiz;
	
	/**
	 * 进入开发者登录页面
	 * @return
	 */
	@RequestMapping("/devlogin.html")
	public String devlogin(){
		
		return "devlogin";
	}
	
	/**
	 * 开发者登录后的首页
	 */
	@RequestMapping("/main.html")
	public String main(){
		return "developer/main";
	}
	/////////
	
}
