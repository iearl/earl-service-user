package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.entity.TUserInfo;

public interface TUserInfoDao extends BaseDao<TUserInfo> {
	
	//管理员用户信息管理，查找求职会员和公司会员
	public List<TFeedInfo> selectManageUInfoByMapList(
			Map<String, Object> testMap);
	public long selectManageUInfoByMapCount(Map<String, Object> testMap);

	// 根据条件查询最近七天的求职会员和公司会员注册数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map);

	// 登录时根据用户名和邮箱查找用户信息
	public TUserInfo findByUserId(String sqlName, String parameter);

	// 登录时更新用户信息
	public int updateUserInfo(String sqlName, TUserInfo user);

}