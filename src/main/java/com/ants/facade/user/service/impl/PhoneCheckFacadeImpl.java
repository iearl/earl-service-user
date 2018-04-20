package com.ants.facade.user.service.impl;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.service.PhoneCheckFacade;
import com.ants.service.user.biz.PhoneCheckBiz;
/**  
 * @ClassName: TUserInfoFacade  
 * @Description: TODO(短信验证码)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
@Service("phoneCheckFacade")
public class PhoneCheckFacadeImpl implements PhoneCheckFacade{
	
	@Autowired
	private PhoneCheckBiz phoneCheckBiz;


	@Override
	public boolean registerPhone(String phoneNumber, String authCode) {
		//注册时，验证手机号
		return phoneCheckBiz.registerPhone(phoneNumber,authCode);
	}

	
	@Override
	public boolean quickLoginPhone(String phoneNumber, String authCode) {
		return false;
	}


	
}
