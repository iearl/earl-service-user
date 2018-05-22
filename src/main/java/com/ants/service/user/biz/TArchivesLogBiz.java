package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TArchivesLog;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.service.user.dao.TArchivesLogDao;

/**  
 * @ClassName: TArchivesLogBiz  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月21日  
 *    
 */
@Service("tArchivesLogBiz")
public class TArchivesLogBiz {
	
	@Autowired
	private TArchivesLogDao tArchivesLogDao;
	
	public List<TArchivesLog> selectTArchivesLogByMap(Map<String, Object> testMap) {
		return tArchivesLogDao.selectTArchivesLogByMap(testMap);
	}
	public long getTotal(Map<String, Object> testMap) {
		// TODO Auto-generated method stub
		return tArchivesLogDao.getTotal(testMap);
	}

	
	public long insert(TArchivesLog record) {
		return tArchivesLogDao.insert(record);
	}
}
