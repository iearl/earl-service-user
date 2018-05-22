package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TProgInfo;
import com.ants.service.user.dao.TProgInfoDao;

/**
 * @ClassName: TBaseInfoBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
@Service("tProgInfoBiz")
public class TProgInfoBiz {

	@Autowired
	private TProgInfoDao tProgInfoDao;
	
	public List<TProgInfo> selectManageProgInfoByMapList(Map<String, Object> map) {
		return tProgInfoDao.selectManageProgInfoByMapList(map);
	}
	public long selectManageProgInfoByMapCount(
			Map<String, Object> map) {
		return tProgInfoDao.selectManageProgInfoByMapCount(map);
	}
	
	public long deleteProgInfoByList(List<String> list){
		return 0;
	}
	
	public List<TProgInfo> selectTProgInfoByMap(Map<String, Object> map){
		return tProgInfoDao.selectTProgInfoByMap(map);
	}

	public List<TProgInfo> selectByMap(Map<String, Object> map) {
		return tProgInfoDao.selectByMap(map);
	}
	
	public long insert(TProgInfo record) {
		return tProgInfoDao.insert(record);
	}
}
