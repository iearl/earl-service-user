package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.entity.TUserInfo;
import com.ants.service.user.dao.TUserInfoDao;

@Repository("tUserInfoDao")
public class TUserInfoDaoImpl extends BaseDaoImpl<TUserInfo> implements
		TUserInfoDao {

	//管理员用户信息管理，查找求职会员和公司会员
	public List<TFeedInfo> selectManageUInfoByMapList(
			Map<String, Object> testMap) {
		return super.getSqlSession().selectList("selectManageUInfoByMapList", testMap);
	}
	public long selectManageUInfoByMapCount(Map<String, Object> testMap) {
		return super.getSqlSession().selectOne("selectManageUInfoByMapCount", testMap);
	}
	// 根据条件查询最近七天的求职会员和公司会员注册数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map) {
		return super.getSqlSession().selectList("searchSevenDayTUserInfoCount", map);
	}

	/**
	 * //登录时根据用户名和邮箱查找用户信息
	 */
	@Override
	public TUserInfo findByUserId(String sqlName, String parameter) {
		return super.getSqlSession()
				.selectOne(getStatement(sqlName), parameter);
	}

	// 登录是更新用户信息
	@Override
	public int updateUserInfo(String sqlName, TUserInfo user) {
		return super.getSqlSession().update(sqlName, user);
	}

}