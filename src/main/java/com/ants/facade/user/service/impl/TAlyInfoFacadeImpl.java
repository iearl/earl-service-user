package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAlyInfo;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.service.TAlyInfoFacade;
import com.ants.service.user.biz.TAlyInfoBiz;

/**
 * @ClassName: TAlyInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Service("tAlyInfoFacade")
public class TAlyInfoFacadeImpl implements TAlyInfoFacade {

	@Autowired
	private TAlyInfoBiz tAlyInfoBiz;
	
	//管理员查看简历信息
	@Override
	public List<TAlyInfo> selectManageAlyInfoByMapList(
			Map<String, Object> testMap) {
		return tAlyInfoBiz.selectManageAlyInfoByMapList(testMap);
	}
	@Override
	public long selectManageAlyInfoByMapCount(Map<String, Object> testMap) {
		return tAlyInfoBiz.selectManageAlyInfoByMapCount(testMap);
	}

	// 根据条件查询最近七天的简历发布数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map){
		return tAlyInfoBiz.searchSevenDayCount(map);
	}

	// 更新个人简历
	@Override
	public int updateByPrimaryKey(TAlyInfo record) {
		return tAlyInfoBiz.updateByPrimaryKey(record);
	}

	// 插入简历信息
	@Override
	public long insert(TAlyInfo record) {
		return tAlyInfoBiz.insert(record);
	}

	// 查询当前登录人的简历
	@Override
	public TAlyInfo selectTAlyInfoByUId(Integer uId) {
		return tAlyInfoBiz.selectTAlyInfoByUId(uId);
	}

	@Override
	public int deleteByPrimaryKey(Integer alyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TAlyInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TAlyInfo selectByPrimaryKey(Integer alyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TAlyInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(TAlyInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
