package com.entity.model;

import com.entity.TiezixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 帖子信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public class TiezixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 帖子类型
	 */
	
	private String tiezileixing;
		
	/**
	 * 关键词
	 */
	
	private String guanjianci;
		
	/**
	 * 发帖时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fatieshijian;
		
	/**
	 * 帖子内容
	 */
	
	private String tiezineirong;
		
	/**
	 * 帖子封面
	 */
	
	private String tiezifengmian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：帖子类型
	 */
	 
	public void setTiezileixing(String tiezileixing) {
		this.tiezileixing = tiezileixing;
	}
	
	/**
	 * 获取：帖子类型
	 */
	public String getTiezileixing() {
		return tiezileixing;
	}
				
	
	/**
	 * 设置：关键词
	 */
	 
	public void setGuanjianci(String guanjianci) {
		this.guanjianci = guanjianci;
	}
	
	/**
	 * 获取：关键词
	 */
	public String getGuanjianci() {
		return guanjianci;
	}
				
	
	/**
	 * 设置：发帖时间
	 */
	 
	public void setFatieshijian(Date fatieshijian) {
		this.fatieshijian = fatieshijian;
	}
	
	/**
	 * 获取：发帖时间
	 */
	public Date getFatieshijian() {
		return fatieshijian;
	}
				
	
	/**
	 * 设置：帖子内容
	 */
	 
	public void setTiezineirong(String tiezineirong) {
		this.tiezineirong = tiezineirong;
	}
	
	/**
	 * 获取：帖子内容
	 */
	public String getTiezineirong() {
		return tiezineirong;
	}
				
	
	/**
	 * 设置：帖子封面
	 */
	 
	public void setTiezifengmian(String tiezifengmian) {
		this.tiezifengmian = tiezifengmian;
	}
	
	/**
	 * 获取：帖子封面
	 */
	public String getTiezifengmian() {
		return tiezifengmian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
