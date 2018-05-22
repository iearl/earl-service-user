package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.service.TFeedInfoFacade;
import com.ants.service.user.biz.TFeedInfoBiz;

/**
 * @ClassName: TFeedInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月23日
 * 
 */
@Service("tFeedInfoFacade")
public class TFeedInfoFacadeImpl implements TFeedInfoFacade {
	
	@Autowired
	private TFeedInfoBiz tFeedInfoBiz;
	@Override
	public long updateByPrimaryKey(TFeedInfo record) {
		return tFeedInfoBiz.updateByPrimaryKey(record);
	}
	@Override
	public List<TFeedInfo> selectTFeedInfoByMap(Map<String, Object> testMap) {
		return tFeedInfoBiz.selectTFeedInfoByMap(testMap);
	}

	@Override
	public long getTotal(Map<String, Object> testMap) {
		return tFeedInfoBiz.getTotal(testMap);
	}

	@Override
	public long insert(TFeedInfo record) {
		return tFeedInfoBiz.insert(record);
	}

	@Override
	public long deleteByPrimaryKey(Integer fdId) {
		
		return 0;
	}

	@Override
	public int insertSelective(TFeedInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TFeedInfo selectByPrimaryKey(Integer fdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TFeedInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}


}
