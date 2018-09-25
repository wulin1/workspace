package cn.jbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jbit.biz.ReceptionBiz;

/**
 * ǰ̨ ������
 * @author����
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
	 * ���뿪���ߵ�¼ҳ��
	 * @return
	 */
	@RequestMapping("/devlogin.html")
	public String devlogin(){
		
		return "devlogin";
	}
	
	/**
	 * �����ߵ�¼�����ҳ
	 */
	@RequestMapping("/main.html")
	public String main(){
		return "developer/main";
	}
	/////////
	
}
