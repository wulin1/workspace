package cn.jbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jbit.biz.BackstageBiz;

/**
 * ��̨������
 * @author ����
 *
 */
@Controller
@RequestMapping("/Backstage")
public class Backstage {
	@Autowired
	private BackstageBiz backstageBiz;

	
	/**
	 * ������ҳҳ��
	 * @return
	 */
	@RequestMapping("/index.html")
	public String index(){
		return "index";
	}
/**
 * �����̨��¼ҳ��
 */
	@RequestMapping("/backendlogin.html")
	public String backendlogin(){
		return "backendlogin";
	}
/**
 * ��¼��̨�����ҳ
 */ 
	@RequestMapping("/main.html")
	public String main(){
		return "backend/main";
	}
	}

