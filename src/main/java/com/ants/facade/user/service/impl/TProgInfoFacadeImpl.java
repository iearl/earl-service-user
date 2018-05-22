package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TProgInfo;
import com.ants.facade.user.service.TProgInfoFacade;
import com.ants.service.user.biz.TProgInfoBiz;

/**
 * @ClassName: TProgInfoFacadeImpl
 * @Description: TODO(职位投递信息)
 * @author 马高伟
 * @date 2018年4月15日
 * 
 */
@Service("tProgInfoFacade")
public class TProgInfoFacadeImpl implements TProgInfoFacade {

	@Autowired
	private TProgInfoBiz tProgInfoBiz;
	
	@Override
	public List<TProgInfo> selectManageProgInfoByMapList(Map<String, Object> map) {
		return tProgInfoBiz.selectManageProgInfoByMapList(map);
	}
	@Override
	public long selectManageProgInfoByMapCount(
			Map<String, Object> map) {
		return tProgInfoBiz.selectManageProgInfoByMapCount(map);
	}
	
	public long deleteProgInfoByList(List<String> list){
		return 0;
	}
	
	public List<TProgInfo> selectTProgInfoByMap(Map<String, Object> map){
		return tProgInfoBiz.selectTProgInfoByMap(map);
	}

	@Override
	public List<TProgInfo> selectByMap(Map<String, Object> map) {
		return tProgInfoBiz.selectByMap(map);
	}
	
	@Override
	public long insert(TProgInfo record) {
		return tProgInfoBiz.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer progId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TProgInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TProgInfo selectByPrimaryKey(Integer progId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TProgInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TProgInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
