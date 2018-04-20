package com.ants.facade.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TMenuInfo;
import com.ants.facade.user.service.TMenuInfoFacade;
import com.ants.service.user.biz.TMenuInfoBiz;

/**  
 * @ClassName: TMenuInfoFacadeImpl  
 * @Description: TODO(菜单对外提供的服务)  
 * @author 马高伟
 * @date 2018年4月10日  
 *    
 */
@Service("tMenuInfoFacede")
public class TMenuInfoFacadeImpl implements TMenuInfoFacade{
	
	@Autowired
	private TMenuInfoBiz tMenuInfoBiz;

	@Override
	public List<TMenuInfo> selectListTMenuInfo() {
		List<TMenuInfo> list = tMenuInfoBiz.selectListTMenuInfo();
		List<TMenuInfo> retVal = new ArrayList<>();//最终返回的数据
		for(int i=0;i<list.size();i++){
			TMenuInfo info = list.get(i);
			if("N".equals(info.getIsLeaf())){//不是叶子执行
				List<TMenuInfo> subMenus = new ArrayList<>();
				for(int j=0;j<list.size();j++){
					TMenuInfo subInfo = list.get(j);
					if(info.getMenuId().equals(subInfo.getMotherId())){
						subMenus.add(subInfo);
					}
				}
				info.setMenus(subMenus);
				retVal.add(info);
			}
		}
		return retVal;
	}

}
