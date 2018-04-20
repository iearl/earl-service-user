package com.ants.service.user.dao;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.TUserInfo;

public interface TUserInfoDao extends BaseDao<TUserInfo> {
	
	//登录时根据用户名和邮箱查找用户信息
	public TUserInfo findByUserId(String sqlName,String parameter);
	
	//登录时更新用户信息
	public int updateUserInfo(String sqlName, TUserInfo user);
  
}