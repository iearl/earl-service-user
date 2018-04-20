package com.ants.service.user.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TCompanyInfo;
import com.ants.service.user.dao.TCompanyInfoDao;

/**  
 * @ClassName: TCompanyInfoBiz  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月15日  
 *    
 */
@Service("TCompanyInfoBiz")
public class TCompanyInfoBiz {
	
	@Autowired
	private TCompanyInfoDao tCompanyInfoDao;
	
	public int updateByPrimaryKey(TCompanyInfo record){
		return tCompanyInfoDao.updateByPrimaryKey(record);
	}
	
	public TCompanyInfo selectTComInfoByUId(Integer uId){
		return tCompanyInfoDao.selectTComInfoByUId(uId);
	}
	
	public long insert(TCompanyInfo record){
		return tCompanyInfoDao.insert(record);
	}
}
