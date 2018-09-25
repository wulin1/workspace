package cn.jbit.biz;

import cn.jbit.pojo.Backend_user;

/**
 * 前台接口
 * @author 吴林
 *
 */
public interface ReceptionBiz {
	
	/**
	 * 登录
	 * @return
	 */
	public Backend_user getLoginUser();
}
