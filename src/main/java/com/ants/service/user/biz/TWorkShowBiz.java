package com.ants.service.user.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TWorkShow;
import com.ants.service.user.dao.TWorkShowDao;

/**  
 * @ClassName: TWorkShowBiz  
 * @Description: TODO(工作经验业务逻辑类)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
@Service("tWorkShowBiz")
public class TWorkShowBiz {
	
	@Autowired
	private TWorkShowDao tWorkShowDao;
	public long insert(TWorkShow record) {
		return tWorkShowDao.insert(record);
	}
}
