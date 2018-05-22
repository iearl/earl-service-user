package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TJobInfo;
import com.ants.facade.user.service.TJobInfoFacede;
import com.ants.service.user.biz.TJobInfoBiz;

/**
 * @ClassName: TJobInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月6日
 * @version 1.0
 */
@Service("tJobInfoFacade")
public class TJobInfoFacadeImpl implements TJobInfoFacede {
	@Autowired
	private TJobInfoBiz tJobInfoBiz;
	
	// 查询所有职位分类信息
	public List<TAreaInfo> selectTJobInfoList(Map<String, Object> map){
		return tJobInfoBiz.selectTJobInfoList(map);
	}

	public long selectTJobInfoCount(Map<String, Object> map){
		return tJobInfoBiz.selectTJobInfoCount(map);
	}

	@Override
	public List<Map<String,String>> searchJobNameById(Map<String,String> mapCon) {
		return tJobInfoBiz.searchJobNameById(mapCon);
	}

	@Override
	public List<TJobInfo> selectTJobList(String jobId) {
		return tJobInfoBiz.selectTJobList(jobId);
	}

	public List<TJobInfo> selectByPrimaryKey(Integer jobId) {
		return tJobInfoBiz.selectByPrimaryKey(jobId);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return tJobInfoBiz.listPage(pageParam, paramMap);
	}

	@Override
	public List<TJobInfo> selectByMap(Map<String, Integer> map) {
		return tJobInfoBiz.selectByMap(map);
	}

	@Override
	public Long getTotal(Map<String, Integer> map) {
		return tJobInfoBiz.getTotal(map);
	}

}
