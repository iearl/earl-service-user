package com.ants.facade.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TBaseInfo;
import com.ants.facade.user.service.TBaseInfoFacade;
import com.ants.service.user.biz.TBaseInfoBiz;

/**
 * @ClassName: TBaseInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
@Service("tBaseInfoFacade")
public class TBaseInfoFacadeImpl implements TBaseInfoFacade {
	
	@Autowired
	private TBaseInfoBiz tBaseInfoBiz;
	//更新个人信息
	@Override
	public long updateByPrimaryKey(TBaseInfo record) {
		return tBaseInfoBiz.updateByPrimaryKey(record);
	}
	
	// 完善个人信息
	@Override
	public Long insert(TBaseInfo record) {
		return tBaseInfoBiz.insert(record);
	}
	/**
	 * 查询个人信息
	 */
	@Override
	public TBaseInfo selectByPrimaryKey(Integer uId) {
		return tBaseInfoBiz.selectByPrimaryKey(uId);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer buId) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int insertSelective(TBaseInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(TBaseInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
