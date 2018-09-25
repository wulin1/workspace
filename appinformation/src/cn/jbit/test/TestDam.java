package cn.jbit.test;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jbit.biz.TestBiz;
import cn.jbit.pojo.Backend_user;

/**
 * 测试类
 * @author 
 *
 */
public class TestDam {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
	TestBiz ub = (TestBiz)context.getBean("TestBiz");
	
	@Test
	public void testFind() {
		List<Backend_user> list = ub.test();
		
		for (Backend_user user2 : list) {
			System.out.println("用户名:"+user2.getUserName());
		}
	}
}
