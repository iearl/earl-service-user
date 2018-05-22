package com.ants.service.user.biz;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @ClassName: PhoneCheckBiz
 * @Description: TODO(执行手机号码校验业务逻辑类、利用阿里大于完成短信服务)
 * @author 马高伟
 * @date 2018年4月4日
 * 
 */
@Service("phoneCheckBiz")
public class PhoneCheckBiz {
	static final String signName = "直聘宝";
	static final String templateCode = "SMS_126362360";
	
    static final String product = "Dysmsapi";
    static final String domain = "dysmsapi.aliyuncs.com";

	static final String accessKeyId = "LTAILWDqInbrofgg";
	static final String accessKeySecret = "yJIt26cHeVx0mMGc4aX5rEs7z06AGU";
	
	private static final Log log = LogFactory.getLog(EmailCheckBiz.class);
	
	public boolean registerPhone(String phoneNumber, String authCode) {
		SendSmsResponse response = sendSms(phoneNumber,authCode);
		
		return response!=null?true:false;
	}

    public static SendSmsResponse sendSms(String phoneNumber, String authCode){

        SendSmsResponse sendSmsResponse = null;
		try {
			//可自助调整超时时间
			System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
			System.setProperty("sun.net.client.defaultReadTimeout", "10000");

			//初始化acsClient,暂不支持region化
			IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
			IAcsClient acsClient = new DefaultAcsClient(profile);

			SendSmsRequest request = new SendSmsRequest();
			request.setPhoneNumbers(phoneNumber);
			request.setSignName(signName);
			request.setTemplateCode(templateCode);
			
			request.setTemplateParam("{\"code\":\""+authCode+"\"}");

     
			sendSmsResponse = acsClient.getAcsResponse(request);
		} catch (ClientException e) {
			 log.error(phoneNumber+"发送短信失败"+e);
		}

        return sendSmsResponse;
    }

}
