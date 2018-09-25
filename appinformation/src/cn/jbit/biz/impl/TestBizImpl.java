package cn.jbit.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jbit.biz.TestBiz;
import cn.jbit.dao.TestMapper;
import cn.jbit.pojo.Backend_user;
@Service("TestBiz")

public class TestBizImpl implements TestBiz {
	@Autowired
	private TestMapper TestBiz;
	/**
	 * ≤‚ ‘
	 */
	@Override
	public List<Backend_user> test() {
		
		return TestBiz.test();
	}
   
}
