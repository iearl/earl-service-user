package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TSubInfo;
import com.ants.facade.user.service.TSubInfoFacade;
import com.ants.service.user.biz.TSubInfoBiz;

/**
 * @ClassName: TSubInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Service("tSubInfoFacade")
public class TSubInfoFacadeImpl implements TSubInfoFacade {

	@Autowired
	private TSubInfoBiz tsubInfoBiz;
	
	// 查询所有学科信息
	public List<TAreaInfo> selectTSubInfoList(Map<String, Object> map){
		return tsubInfoBiz.selectTSubInfoList(map);
	}

	public long selectTSubInfoCount(Map<String, Object> map){
		return tsubInfoBiz.selectTSubInfoCount(map);
	}

	@Override
	public List<Map<String, String>> selectTSubInfoByMap(
			Map<String, String> subMap) {
		return tsubInfoBiz.selectTSubInfoByMap(subMap);
	}
	
	@Override
	public List<Map<String, String>>  selectSubNameBySubThree(Map<String,String> map) {
		
		return tsubInfoBiz.selectSubNameBySubThree(map);
	}

	@Override
	public int deleteByPrimaryKey(String subId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TSubInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TSubInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TSubInfo selectByPrimaryKey(String subId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TSubInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TSubInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
