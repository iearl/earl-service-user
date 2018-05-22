package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAlyInfo;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.service.user.dao.TAlyInfoDao;

/**
 * @ClassName: TAlyInfoBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Service("tAlyInfoBiz")
public class TAlyInfoBiz {

	@Autowired
	private TAlyInfoDao tAlyInfoDao;
	
	//管理员查看简历信息
	public List<TAlyInfo> selectManageAlyInfoByMapList(
			Map<String, Object> testMap) {
		return tAlyInfoDao.selectManageAlyInfoByMapList(testMap);
	}
	public long selectManageAlyInfoByMapCount(Map<String, Object> testMap) {
		return tAlyInfoDao.selectManageAlyInfoByMapCount(testMap);
	}

	// 根据条件查询最近七天的简历发布数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map) {
		return tAlyInfoDao.searchSevenDayCount(map);
	}

	public long insert(TAlyInfo record) {
		return tAlyInfoDao.insert(record);
	}

	// 查询当前登录人的简历
	public TAlyInfo selectTAlyInfoByUId(Integer uId) {
		return tAlyInfoDao.selectTAlyInfoByUId(uId);
	}

	public int updateByPrimaryKey(TAlyInfo record) {
		return tAlyInfoDao.updateByPrimaryKey(record);
	}
}
