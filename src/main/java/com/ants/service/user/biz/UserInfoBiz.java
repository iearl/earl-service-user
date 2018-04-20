package com.ants.service.user.biz;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.UserInfo;
import com.ants.service.user.dao.UserInfoDao;


/**
 * 
 * @描述: 用户表--服务层接口 .
 * @作者: WuShuicheng .
 * @创建时间: 2013-7-25,下午10:41:04 .
 * @版本: 1.0 .
 */
@Service("userInfoBiz")
public class UserInfoBiz {

	@Autowired
	private UserInfoDao userInfoDao;
	
	public Long getTotal(Map<String, Object> map){
		return userInfoDao.getTotal(map);
	}
	/**
	 * 保存用户信息.
	 * @param pmsUser
	 */
	public void create(UserInfo userInfo) {
		userInfoDao.insert(userInfo);
	}
	
	/**
	 * 根据ID获取用户信息.
	 * @param userId
	 * @return
	 */
	public UserInfo getById(Long userId) {
		return userInfoDao.getById(userId);
	}

	/**
	 * 根据登录名取得用户对象
	 */
	public UserInfo findUserByUserId(String userId) {
		return userInfoDao.findByUserId(userId);
	}

	/**
	 * 根据ID删除一个用户，同时删除与该用户关联的角色关联信息. type="1"的超级管理员不能删除.
	 * 
	 * @param id
	 *            用户ID.
	 */
	public void deleteUserById(long userId) {
		UserInfo userInfo = userInfoDao.getById(userId);
		if (userInfo != null) {
			userInfoDao.deleteById(userInfo.getId());
		}
	}

	
	/**
	 * 更新用户信息.
	 * @param user
	 */
	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}
	
	/**
	 * 根据用户ID更新用户密码.
	 * 
	 * @param userId
	 * @param newPwd
	 *            (已进行SHA1加密)
	 */
//	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
//		PmsUser pmsUser = pmsUserDao.getById(userId);
//		pmsUser.setUserPwd(newPwd);
//		pmsUser.setPwdErrorCount(0); // 密码错误次数重置为0
//		pmsUser.setIsChangedPwd(isTrue); // 设置密码为已修改过
//		pmsUserDao.update(pmsUser);
//	}



	/**
	 * 查询并分页列出用户信息.
	 * @param pageParam
	 * @param paramMap
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return userInfoDao.listPage(pageParam, paramMap);
	}



}