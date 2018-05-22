package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.entity.TUserInfo;
import com.ants.facade.user.entity.UserInfo;
import com.ants.service.user.dao.TUserInfoDao;

/**
 * @ClassName: TUserInfoBiz
 * @Description: TODO(用户信息操作类)
 * @author 马高伟
 * @date 2018年4月4日
 * 
 */
@Service("tUserInfoBiz")
public class TUserInfoBiz {

	@Autowired
	private TUserInfoDao tUserInfoDao;
	
	//管理员用户信息管理，查找求职会员和公司会员
	public List<TFeedInfo> selectManageUInfoByMapList(
			Map<String, Object> testMap) {
		return tUserInfoDao.selectManageUInfoByMapList(testMap);
	}
	public long selectManageUInfoByMapCount(Map<String, Object> testMap) {
		return tUserInfoDao.selectManageUInfoByMapCount(testMap);
	}

	// 根据条件查询最近七天的求职会员和公司会员注册数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map){
		return tUserInfoDao.searchSevenDayCount(map);
	}

	// 根据用户名或邮箱查找用户
	public TUserInfo findUserByUserId(String sqlName, String parameter) {
		return tUserInfoDao.findByUserId(sqlName, parameter);
	}

	public int updateUserInfo(String sqlName, TUserInfo user) {
		return tUserInfoDao.updateUserInfo(sqlName, user);
	}

	// 注册保存信息
	public void create(TUserInfo userInfo) {
		tUserInfoDao.insert(userInfo);
	}
}
