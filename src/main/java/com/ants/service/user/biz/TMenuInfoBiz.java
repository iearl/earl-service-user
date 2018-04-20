package com.ants.service.user.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TMenuInfo;
import com.ants.service.user.dao.TMenuInfoDao;

/**
 * @ClassName: TMenuInfoBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月10日
 * 
 */
@Service("tMenuInfoBiz")
public class TMenuInfoBiz {
	
	@Autowired
	private TMenuInfoDao tMenuInfoDao;

	public List<TMenuInfo> selectListTMenuInfo() {

		return tMenuInfoDao.selectListTMenuInfo();
	}
}
