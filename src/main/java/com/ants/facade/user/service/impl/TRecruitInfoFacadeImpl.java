package com.ants.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TJobInfo;
import com.ants.facade.user.entity.TRecruitInfo;
import com.ants.facade.user.service.TRecruitInfoFacade;
import com.ants.service.user.biz.TRecruitInfoBiz;

/**
 * @ClassName: TRecruitInfoFacadeImpl
 * @Description: TODO(职位信息操作类)
 * @author 马高伟
 * @date 2018年4月16日
 * 
 */
@Service("tRecruitInfoFacade")
public class TRecruitInfoFacadeImpl implements TRecruitInfoFacade {
	@Autowired
	private TRecruitInfoBiz tRecruitInfoBiz;
	
	@Override
	public List<TRecruitInfo> selectManageRecInfoByMapList(
			Map<String, Object> map) {
		return tRecruitInfoBiz.selectManageRecInfoByMapList(map);
	}
	@Override
	public long selectManageAlyInfoByMapCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tRecruitInfoBiz.selectManageAlyInfoByMapCount(map);
	}
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map){
		return tRecruitInfoBiz.searchSevenDayCount(map);
	}

	
	@Override
	public long updateTRecruitInfoByRecId(TRecruitInfo record) {
		return tRecruitInfoBiz.updateTRecruitInfoByRecId(record);
	}

	@Override
	public List<TRecruitInfo> selectByMap(Map<String, Object> map) {
		return tRecruitInfoBiz.selectByMap(map);
	}
	
	@Override
	public long getTotal(Map<String, Object> testMap) {
		return tRecruitInfoBiz.getTotal(testMap);
	}

	// 发布职位信息
	@Override
	public long insert(TRecruitInfo record) {

		return tRecruitInfoBiz.insert(record);
	}

	@Override
	public long deleteTRecruitInfoByMap(List<Map<String,Object>> list){
		
		return tRecruitInfoBiz.deleteTRecruitInfoByMap(list);
	}

	@Override
	public int insertSelective(TRecruitInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TRecruitInfo selectByPrimaryKey(Integer recId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(TRecruitInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
