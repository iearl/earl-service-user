package com.ants.service.user.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TBaseInfo;
import com.ants.service.user.dao.TBaseInfoDao;

/**  
 * @ClassName: TBaseInfoBiz  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月13日  
 *    
 */
@Service("tBaseInfoBiz")
public class TBaseInfoBiz {
	
	@Autowired
	private TBaseInfoDao tBaseInfoDao;
	
	public Long insert(TBaseInfo record) {
		return tBaseInfoDao.insert(record);
	}
	public long updateByPrimaryKey(TBaseInfo record) {
		return tBaseInfoDao.updateByPrimaryKey(record);
	}

	public TBaseInfo selectByPrimaryKey(Integer uId) {
		return tBaseInfoDao.selectByPrimaryKey(uId);
	}
}
