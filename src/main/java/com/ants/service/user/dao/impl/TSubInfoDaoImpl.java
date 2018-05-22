package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TSubInfo;
import com.ants.service.user.dao.TSubInfoDao;

/**
 * @ClassName: TSubInfoDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Repository("tSubInfoDao")
public class TSubInfoDaoImpl extends BaseDaoImpl<TSubInfo> implements
		TSubInfoDao {

	// 查询所有学科信息
	public List<TAreaInfo> selectTSubInfoList(Map<String, Object> map) {
		return super.getSqlSession().selectList("selectTSubInfoList", map);
	}

	public long selectTSubInfoCount(Map<String, Object> map) {
		return super.getSqlSession().selectOne("selectTSubInfoCount",map);
	}

	@Override
	public List<Map<String, String>> selectTSubInfoByMap(
			Map<String, String> subMap) {
		return super.getSqlSession().selectList("selectTSubInfoByMap", subMap);
	}

	public List<Map<String, String>> selectSubNameBySubThree(
			Map<String, String> map) {
		return super.getSqlSession().selectList("selectSubNameBySubThree", map);
	}

}
