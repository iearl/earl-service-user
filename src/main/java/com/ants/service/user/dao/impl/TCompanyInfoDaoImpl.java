/**  

 * <p>Title: TCompanyInfoDaoImpl.java</p>  

 * <p>Description: </p>  

 * <p>Copyright: Copyright (c) 2018</p>  

 * <p>Company: www.baidudu.com</p>  

 * @author shenlan  

 * @date 2018年4月15日  

 * @version 1.0  

 */
package com.ants.service.user.dao.impl;

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

}
