package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TJobInfo;
import com.ants.service.user.dao.TJobInfoDao;

/**
 * @ClassName: TJobInfoBiz
 * @Description: TODO(用户信息操作类)
 * @author 马高伟
 * @date 2018年4月4日
 * 
 */
@Service("tJobInfoBiz")
public class TJobInfoBiz {

	@Autowired
	private TJobInfoDao tJobInfoDao;

	// 查询所有职位分类信息
	public List<TAreaInfo> selectTJobInfoList(Map<String, Object> map) {
		return tJobInfoDao.selectTJobInfoList(map);
	}

	public long selectTJobInfoCount(Map<String, Object> map) {
		return tJobInfoDao.selectTJobInfoCount(map);
	}

	public List<Map<String, String>> searchJobNameById(
			Map<String, String> mapCon) {
		return tJobInfoDao.searchJobNameById(mapCon);
	}

	public List<TJobInfo> selectTJobList(String jobId) {
		return tJobInfoDao.selectTJobList(jobId);
	}

	public List<TJobInfo> selectByPrimaryKey(Integer jobId) {
		return tJobInfoDao.selectByPrimaryKey(jobId);
	}

	public List<TJobInfo> selectByMap(Map<String, Integer> map) {
		return tJobInfoDao.selectByMap(map);
	}

	public Long getTotal(Map<String, Integer> map) {
		return tJobInfoDao.getTotal(map);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return tJobInfoDao.listPage(pageParam, paramMap);
	}

}
