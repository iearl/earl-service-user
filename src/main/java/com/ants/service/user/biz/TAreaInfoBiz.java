package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TAreaInfo;
import com.ants.service.user.dao.TAreaInfoDao;

/**
 * @ClassName: TAreaInfoBiz
 * @Description: TODO(区域信息业务类)
 * @author 马高伟
 * @date 2018年4月14日
 * 
 */
@Service("AreaInfoBiz")
public class TAreaInfoBiz {

	@Autowired
	private TAreaInfoDao tAreaInfoDao;

	public List<Map<String, String>> searchAreaNameById(
			Map<String, String> mapCon) {
		return tAreaInfoDao.searchAreaNameById(mapCon);
	}

	public List<TAreaInfo> selectTAreaList(String province) {
		return tAreaInfoDao.selectTAreaList(province);
	}
}
