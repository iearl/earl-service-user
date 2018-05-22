package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TJobInfo;

public interface TJobInfoDao extends BaseDao<TJobInfo> {

	// 查询所有职位分类信息
	public List<TAreaInfo> selectTJobInfoList(Map<String, Object> map);

	public long selectTJobInfoCount(Map<String, Object> map);

	// 根据职位号查询自身包含上级职位名
	public List<Map<String, String>> searchJobNameById(
			Map<String, String> mapCon);

	// 职业数据联动
	public List<TJobInfo> selectTJobList(String jobId);

	// 通过查找职位分类信息
	public List<TJobInfo> selectByPrimaryKey(Integer jobId);

	public List<TJobInfo> selectByMap(Map<String, Integer> map);

	public Long getTotal(Map<String, Integer> map);

}