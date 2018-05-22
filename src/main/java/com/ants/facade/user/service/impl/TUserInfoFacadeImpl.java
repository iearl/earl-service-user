package com.ants.facade.user.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TFeedInfo;
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
	
	//管理员用户信息管理，查找求职会员和公司会员
	@Override
	public List<TFeedInfo> selectManageUInfoByMapList(
			Map<String, Object> testMap) {
		return tUserInfoBiz.selectManageUInfoByMapList(testMap);
	}
	@Override
	public long selectManageUInfoByMapCount(Map<String, Object> testMap) {
		return tUserInfoBiz.selectManageUInfoByMapCount(testMap);
	}
	
	//根据条件查询最近七天的求职会员和公司会员注册数
		public List<Map<String,String>> searchSevenDayCount(Map<String,String> map){
			return tUserInfoBiz.searchSevenDayCount(map);
		}
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
