package com.entity.vo;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户
 * @author 
 * @email 
 * @date 2024-08-19 15:22:25
 */
public class YonghuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 住址
	 */
	
	private String zhuzhi;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 状态
	 */
	
	private Integer status;
		
	/**
	 * 密码错误次数
	 */
	
	private Integer passwordwrongnum;
		
	/**
	 * 微信openid
	 */
	
	private String openid;
		
	/**
	 * 微信昵称
	 */
	
	private String nickname;
		
	/**
	 * 微信头像
	 */
	
	private String avatarurl;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：住址
	 */
	 
	public void setZhuzhi(String zhuzhi) {
		this.zhuzhi = zhuzhi;
	}
	
	/**
	 * 获取：住址
	 */
	public String getZhuzhi() {
		return zhuzhi;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
				
	
	/**
	 * 设置：密码错误次数
	 */
	 
	public void setPasswordwrongnum(Integer passwordwrongnum) {
		this.passwordwrongnum = passwordwrongnum;
	}
	
	/**
	 * 获取：密码错误次数
	 */
	public Integer getPasswordwrongnum() {
		return passwordwrongnum;
	}
				
	
	/**
	 * 设置：微信openid
	 */
	 
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	/**
	 * 获取：微信openid
	 */
	public String getOpenid() {
		return openid;
	}
				
	
	/**
	 * 设置：微信昵称
	 */
	 
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * 获取：微信昵称
	 */
	public String getNickname() {
		return nickname;
	}
				
	
	/**
	 * 设置：微信头像
	 */
	 
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}
	
	/**
	 * 获取：微信头像
	 */
	public String getAvatarurl() {
		return avatarurl;
	}
			
}
