package com.ants.facade.user.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TUserInfo;
import com.ants.facade.user.service.TUserInfoFacade;
import com.ants.service.user.biz.TUserInfoBiz;
/**  
 * @ClassName: TUserInfoFacade  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
@Service("tUserInfoFacade")
public class TUserInfoFacadeImpl implements TUserInfoFacade{

	@Autowired
	private TUserInfoBiz tUserInfoBiz;
	/**
	 * 登录时根据用户名和邮箱查找用户信息
	 */
	@Override
	public TUserInfo findUserByUserId(String sqlName,String parameter) {
		return tUserInfoBiz.findUserByUserId(sqlName,parameter);
	}
	
	@Override
	public int updateUserInfo(String sqlName, TUserInfo user) {
		return tUserInfoBiz.updateUserInfo(sqlName, user);
		
	}

	//插入用户信息
	@Override
	public void insertUserInfo(TUserInfo userInfo) {
		tUserInfoBiz.create(userInfo);
	}

}
