package com.ants.service.user.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.UserInfo;
import com.ants.service.user.dao.UserInfoDao;


@Repository("userInfoDao")
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo> implements UserInfoDao {

	@Override
	public UserInfo findByUserId(String userId) {
		return super.getSqlSession().selectOne(getStatement("findByUserId"), userId);
	}

	/* (non-Javadoc)
	 * @see com.ants.service.user.dao.UserInfoDao#getTotal(java.util.Map)
	 */
	@Override
	public Long getTotal(Map<String, Object> map) {
		return super.getSqlSession().selectOne(getStatement("getTotal"), map);
	}



	
}
