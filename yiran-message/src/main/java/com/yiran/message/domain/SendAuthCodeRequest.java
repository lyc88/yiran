package com.yiran.message.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 发送短息请求
 * @author pandaa
 *
 */
public class SendAuthCodeRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8352410887159848214L;
	
	/** 模版ID */
	private String templateId;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 验证码
	 */
	private String verifyCode;
	/**
	 * 短信发送流水号
	 */
	private String msgOrderNo;
	/**
	 * 参数
	 */
	private Map<String,String> map = new HashMap<String,String>();
	
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public String getMsgOrderNo() {
		return msgOrderNo;
	}
	public void setMsgOrderNo(String msgOrderNo) {
		this.msgOrderNo = msgOrderNo;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
