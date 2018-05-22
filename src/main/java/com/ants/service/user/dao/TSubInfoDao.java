package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAreaInfo;

/**
 * @ClassName: TSubInfoDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
public interface TSubInfoDao {
	// 查询所有学科信息
	public List<TAreaInfo> selectTSubInfoList(Map<String, Object> map);

	public long selectTSubInfoCount(Map<String, Object> map);

	public List<Map<String, String>> selectTSubInfoByMap(
			Map<String, String> subMap);

	public List<Map<String, String>> selectSubNameBySubThree(
			Map<String, String> map);
}
