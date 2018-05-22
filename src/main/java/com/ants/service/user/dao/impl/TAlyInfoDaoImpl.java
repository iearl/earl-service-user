package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TAlyInfo;
import com.ants.facade.user.entity.TWorkShow;
import com.ants.service.user.dao.TAlyInfoDao;

/**
 * @ClassName: TAlyInfoDaoImpl
 * @Description: TODO(简历信息服务接口实现类)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Repository("tAlyInfoDao")
public class TAlyInfoDaoImpl extends BaseDaoImpl<TAlyInfo> implements
		TAlyInfoDao {
	
	@Override
	public List<TAlyInfo> selectManageAlyInfoByMapList(
			Map<String, Object> testMap) {
		return super.getSqlSession().selectList("selectManageAlyInfoByMapList", testMap);
	}
	@Override
	public long selectManageAlyInfoByMapCount(Map<String, Object> testMap) {
		return super.getSqlSession().selectOne("selectManageAlyInfoByMapCount", testMap);
	}

	// 根据条件查询最近七天的简历发布数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map) {
		return super.getSqlSession().selectList("searchSevenDayTAlyInfoCount", map);
	}

	@Override
	public int updateByPrimaryKey(TAlyInfo record) {
		return super.getSqlSession().update("updateTAlyInfoByUId", record);
	}

	// 添加简历信息
	public long insert(TAlyInfo record) {
		return super.getSqlSession().insert("insertTAlyInfo", record);
	}

	@Override
	public TAlyInfo selectTAlyInfoByUId(Integer uId) {
		return super.getSqlSession().selectOne("selectTAlyInfoByUId", uId);
	}


}
