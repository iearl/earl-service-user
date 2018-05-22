package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TArchivesLog;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.service.TArchivesLogFacade;
import com.ants.service.user.biz.TArchivesLogBiz;

/**
 * @ClassName: TArchivesLogFacadeImpl
 * @Description: TODO(日志操作类)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Service("tArchivesLogFacade")
public class TArchivesLogFacadeImpl implements TArchivesLogFacade {

	@Autowired
	private TArchivesLogBiz tArchivesLogBiz;
	
	@Override
	public List<TArchivesLog> selectTArchivesLogByMap(Map<String, Object> testMap) {
		return tArchivesLogBiz.selectTArchivesLogByMap(testMap);
	}
	@Override
	public long getTotal(Map<String, Object> testMap) {
		// TODO Auto-generated method stub
		return tArchivesLogBiz.getTotal(testMap);
	}

	@Override
	public long insert(TArchivesLog record) {
		return tArchivesLogBiz.insert(record);
	}

	@Override
	public List<TArchivesLog> searchLogInfoByMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer logId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TArchivesLog record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TArchivesLog selectByPrimaryKey(Integer logId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TArchivesLog record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TArchivesLog record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
