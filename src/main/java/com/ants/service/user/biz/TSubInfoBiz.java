package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAreaInfo;
import com.ants.service.user.dao.TSubInfoDao;

/**
 * @ClassName: TSubInfoBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
@Service("tSubInfoBiz")
public class TSubInfoBiz {
	@Autowired
	private TSubInfoDao tSubInfoDao;

	// 查询所有学科信息
	public List<TAreaInfo> selectTSubInfoList(Map<String, Object> map) {
		return tSubInfoDao.selectTSubInfoList(map);
	}

	public long selectTSubInfoCount(Map<String, Object> map) {
		return tSubInfoDao.selectTSubInfoCount(map);
	}

	public List<Map<String, String>> selectTSubInfoByMap(
			Map<String, String> subMap) {
		return tSubInfoDao.selectTSubInfoByMap(subMap);
	}

	public List<Map<String, String>> selectSubNameBySubThree(
			Map<String, String> map) {
		return tSubInfoDao.selectSubNameBySubThree(map);
	}
}
