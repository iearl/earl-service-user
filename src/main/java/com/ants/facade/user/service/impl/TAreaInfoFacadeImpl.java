package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.service.TAreaInfoFacade;
import com.ants.service.user.biz.TAreaInfoBiz;

/**
 * @ClassName: TAreaInfoFacade
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
@Service("tAreaInfoFacade")
public class TAreaInfoFacadeImpl implements TAreaInfoFacade {

	@Autowired
	private TAreaInfoBiz tAreaInfoBiz;

	// 查询所有区域信息
	public List<TAreaInfo> selectTAreaInfoList(Map<String, Object> map){
		return tAreaInfoBiz.selectTAreaInfoList(map);
	}
	public long selectTAreaInfoCount(Map<String,Object> map){
		return tAreaInfoBiz.selectTAreaInfoCount(map);
	}

	public List<Map<String, String>> searchAreaNameById(
			Map<String, String> mapCon) {
		return tAreaInfoBiz.searchAreaNameById(mapCon);
	}

	// 联动查询
	public List<TAreaInfo> selectTAreaList(String province) {
		return tAreaInfoBiz.selectTAreaList(province);
	}

	@Override
	public int deleteByPrimaryKey(Integer areaId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TAreaInfo record) {
		return 0;
	}

	@Override
	public int insertSelective(TAreaInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TAreaInfo selectByPrimaryKey(Integer areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TAreaInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TAreaInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
