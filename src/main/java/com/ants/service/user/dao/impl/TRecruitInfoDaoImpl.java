package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TRecruitInfo;
import com.ants.service.user.dao.TRecruitInfoDao;

/**
 * @ClassName: TRecruitInfoDaoImpl
 * @Description: TODO(职位操作dao实现类)
 * @author 马高伟
 * @date 2018年4月16日
 * 
 */
@Repository("tRecruitInfoDao")
public class TRecruitInfoDaoImpl extends BaseDaoImpl<TRecruitInfo> implements
		TRecruitInfoDao {
	public long insert(TRecruitInfo record) {

		return super.getSqlSession().insert("insertTRecruitInfo", record);
	}

	@Override
	public List<TRecruitInfo> selectByMap(Map<String, Integer> map) {
		return super.getSqlSession().selectList("selectTRecruitInfoByMap", map);
	}

	@Override
	public long getTotal(Map<String, Integer> testMap) {
		return super.getSqlSession().selectOne("selectTRecruitCountByMap", testMap);
	}
}
