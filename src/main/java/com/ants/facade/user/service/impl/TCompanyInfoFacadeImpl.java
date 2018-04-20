package com.ants.facade.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TCompanyInfo;
import com.ants.facade.user.service.TCompanyInfoFacade;
import com.ants.service.user.biz.TCompanyInfoBiz;

/**
 * @ClassName: TCompanyInfoFacadeImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月15日
 * 
 */
@Service("tCompanyInfoFacade")
public class TCompanyInfoFacadeImpl implements TCompanyInfoFacade {

	@Autowired
	private TCompanyInfoBiz tCompanyInfoBiz;

	@Override
	public int updateByPrimaryKey(TCompanyInfo record) {
		return tCompanyInfoBiz.updateByPrimaryKey(record);
	}

	// 根据uId查找公司信息
	@Override
	public TCompanyInfo selectTComInfoByUId(Integer uId) {
		return tCompanyInfoBiz.selectTComInfoByUId(uId);
	}

	// 插入公司信息
	@Override
	public long insert(TCompanyInfo record) {
		// TODO Auto-generated method stub
		return tCompanyInfoBiz.insert(record);
	}

	@Override
	public TCompanyInfo selectByPrimaryKey(Integer cuId) {
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Integer coId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TCompanyInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(TCompanyInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
