package com.ants.service.user.dao;

import java.util.Map;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.UserInfo;

public interface UserInfoDao extends BaseDao<UserInfo> {
	
	UserInfo findByUserId(String userId);
	
	Long getTotal(Map<String, Object> map);
}
