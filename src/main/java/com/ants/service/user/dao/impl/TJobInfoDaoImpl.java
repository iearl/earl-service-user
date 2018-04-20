package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TJobInfo;
import com.ants.service.user.dao.TJobInfoDao;

@Repository("tJobInfoDao")
public class TJobInfoDaoImpl extends BaseDaoImpl<TJobInfo> implements
		TJobInfoDao {
	

	//根据职位号查询自身包含上级职位名
	public List<Map<String,String>> searchJobNameById(Map<String,String> mapCon) {
		return super.getSqlSession().selectList("searchJobNameById", mapCon);
	}

	@Override
	public List<TJobInfo> selectTJobList(String jobId) {
		return super.getSqlSession().selectList("selectTJobList", jobId);
	}

	@Override
	public List<TJobInfo> selectByPrimaryKey(Integer jobId) {
		return null;// super.getSqlSession().selectList("selectJobByPrimaryKey",
					// jobId);
	}

	@Override
	public List<TJobInfo> selectByMap(Map<String, Integer> map) {
		return super.getSqlSession().selectList("selectJobByMap", map);
	}

	public Long getTotal(Map<String, Integer> map) {
		return super.getSqlSession().selectOne("getJobTotle", map);
	}


}