package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TBaseInfo;
import com.ants.facade.user.entity.TCompanyInfo;
import com.ants.service.user.dao.TCompanyInfoDao;

/**
 * @ClassName: TCompanyInfoDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月15日
 * 
 */
@Repository("tCompanyInfoDao")
public class TCompanyInfoDaoImpl extends BaseDaoImpl<TCompanyInfo> implements
		TCompanyInfoDao {
	
	@Override
	public List<TCompanyInfo> selectManageCoInfoByMapList(
			Map<String, Object> map) {
		return super.getSqlSession().selectList("selectManageCoInfoByMapList", map);
	}

	@Override
	public long selectManageCoInfoByMapCount(Map<String, Object> map) {
		return super.getSqlSession().selectOne("selectManageCoInfoByMapCount",map);
	}
	@Override
	public long insert(TCompanyInfo record) {
		return super.getSqlSession().insert("insertTCompanyInfo", record);
	}

	@Override
	public TCompanyInfo selectTComInfoByUId(Integer uId) {
		return super.getSqlSession().selectOne("selectTComInfoByUId", uId);
	}

	@Override
	public int updateByPrimaryKey(TCompanyInfo record) {
		return super.getSqlSession().update("updateCoInfoByUid", record);
	}

	@Override
	public TCompanyInfo selectTComInfoByUMap(Map<String, Object> map) {
		return super.getSqlSession().selectOne("selectTComInfoByMap", map);
	}
}
