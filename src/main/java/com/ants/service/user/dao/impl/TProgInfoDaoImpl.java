package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TBaseInfo;
import com.ants.facade.user.entity.TProgInfo;
import com.ants.facade.user.entity.TWorkShow;
import com.ants.service.user.dao.TProgInfoDao;

/**
 * @ClassName: TSubInfoDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Repository("tProgInfoDao")
public class TProgInfoDaoImpl extends BaseDaoImpl<TProgInfo> implements
		TProgInfoDao {
	@Override
	public List<TProgInfo> selectManageProgInfoByMapList(Map<String, Object> map) {
		return super.getSqlSession().selectList("selectManageProgInfoByMapList", map);
	}
	@Override
	public long selectManageProgInfoByMapCount(Map<String, Object> map) {
		return super.getSqlSession().selectOne("selectManageProgInfoByMapCount",map);
	}
	public long deleteProgInfoByList(List<String> list){
		return super.getSqlSession().update("deleteProgInfoByList", list);
	}
	
	public List<TProgInfo> selectTProgInfoByMap(Map<String, Object> map){
		return super.getSqlSession().selectList("selectTProgInfoByMap", map);
	}

	@Override
	public List<TProgInfo> selectByMap(Map<String, Object> map) {
		return super.getSqlSession().selectList("searchProgInfoByMap", map);
	}

	public long insert(TProgInfo record) {
		return super.getSqlSession().insert("insertTProgInfo", record);

	}
}
