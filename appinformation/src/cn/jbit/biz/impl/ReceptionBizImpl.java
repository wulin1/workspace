package cn.jbit.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jbit.biz.ReceptionBiz;
import cn.jbit.dao.ReceptionMapper;
import cn.jbit.pojo.Backend_user;
@Service("ReceptionBiz")
public class ReceptionBizImpl implements ReceptionBiz  {
	@Autowired
	private ReceptionMapper receptionMapper;

	/**
	 * µÇÂ¼
	 */
	@Override
	public Backend_user getLoginUser() {
		
		return receptionMapper.getLoginUser();
	}
}
