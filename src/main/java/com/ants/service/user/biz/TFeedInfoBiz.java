package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TFeedInfo;
import com.ants.service.user.dao.TFeedInfoDao;

/**
 * @ClassName: TFeedInfoBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月23日
 * 
 */
@Service("tFeedInfoBiz")
public class TFeedInfoBiz {
	
	@Autowired
	private TFeedInfoDao tFeedInfoDao;
	
	public List<TFeedInfo> selectTFeedInfoByMap(Map<String, Object> testMap) {
		return tFeedInfoDao.selectTFeedInfoByMap(testMap);
	}

	public long getTotal(Map<String, Object> testMap) {
		return tFeedInfoDao.getTotal(testMap);
	}
	
	public long insert(TFeedInfo record) {
		return tFeedInfoDao.insert(record);
	}
	public long updateByPrimaryKey(TFeedInfo record) {
		return tFeedInfoDao.updateByPrimaryKey(record);
	}
}
