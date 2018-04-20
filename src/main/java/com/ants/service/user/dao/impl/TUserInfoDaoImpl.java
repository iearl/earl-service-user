package com.ants.service.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TUserInfo;
import com.ants.service.user.dao.TUserInfoDao;

@Repository("tUserInfoDao")
public class TUserInfoDaoImpl extends BaseDaoImpl<TUserInfo> implements TUserInfoDao{
	
	/**
	 * //登录时根据用户名和邮箱查找用户信息
	 */
	@Override
	public TUserInfo findByUserId(String sqlName,String parameter) {
		return super.getSqlSession().selectOne(getStatement(sqlName), parameter);
	}

	//登录是更新用户信息
	@Override
	public int updateUserInfo(String sqlName, TUserInfo user) {
		return super.getSqlSession().update(sqlName, user);
	}

	
    
}