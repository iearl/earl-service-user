package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAlyInfo;

/**
 * @ClassName: TAlyInfoDao
 * @Description: TODO(简历信息dao接口)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
public interface TAlyInfoDao {

	//管理员查看简历信息
	public List<TAlyInfo> selectManageAlyInfoByMapList(Map<String, Object> testMap);
	public long selectManageAlyInfoByMapCount(Map<String, Object> testMap);

	// 根据条件查询最近七天的简历发布数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map);

	public long insert(TAlyInfo record);

	public TAlyInfo selectTAlyInfoByUId(Integer uId);

	public int updateByPrimaryKey(TAlyInfo record);
}
