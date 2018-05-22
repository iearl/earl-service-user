package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TWorkShow;
import com.ants.facade.user.service.TWorkShowFacade;
import com.ants.service.user.biz.TWorkShowBiz;

/**
 * @ClassName: TWorkShowFacadeImpl
 * @Description: TODO(工作经验服务接口实现类)
 * @author 马高伟
 * @date 2018年4月19日
 * 
 */
@Service("tWorkShowFacade")
public class TWorkShowFacadeImpl implements TWorkShowFacade {
	@Autowired
	private TWorkShowBiz tWorkShowBiz;

	@Override
	public long insert(TWorkShow record) {
		return tWorkShowBiz.insert(record);
	}
	@Override
	public List<TWorkShow> selectManageWorkShowInfoByMapList(
			Map<String, Object> map) {
		return tWorkShowBiz.selectManageWorkShowInfoByMapList(map);
	}
	@Override
	public long selectManageWorkShowInfoByMapCount(Map<String, Object> map) {
		return tWorkShowBiz.selectManageWorkShowInfoByMapCount(map);
	}
	//根据uId查找工作经验
	@Override
	public List<Map<String,String>> selectTWorkShowListByUId(Integer uId) {
		return tWorkShowBiz.selectTWorkShowListByUId(uId);
	}

	@Override
	public int deleteByPrimaryKey(Integer workId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TWorkShow record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TWorkShow selectByPrimaryKey(Integer workId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TWorkShow record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TWorkShow record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
