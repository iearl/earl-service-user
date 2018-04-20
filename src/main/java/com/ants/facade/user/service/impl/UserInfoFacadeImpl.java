/**
 * 
 */
package com.ants.facade.user.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.UserInfo;
import com.ants.facade.user.service.UserInfoFacade;
import com.ants.service.user.biz.UserInfoBiz;

/**
 * @描述: 用户Dubbo服务接口实现 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-1-26,上午1:43:41 .
 * @版本号: V1.0 .
 */
@Service("userInfoFacade")
public class UserInfoFacadeImpl implements UserInfoFacade {
	
	@Autowired
	private UserInfoBiz userInfoBiz;

	

	@Override
	public UserInfo findUserByUserId(String userId) {
		return userInfoBiz.findUserByUserId(userId);
	}



	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return userInfoBiz.listPage(pageParam, paramMap);
	}



	/* (non-Javadoc)
	 * @see com.ants.facade.user.service.UserInfoFacade#getTotal(java.util.Map)
	 */
	@Override
	public Long getTotal(Map<String, Object> map) {
		return userInfoBiz.getTotal(map);
	}
	
}
