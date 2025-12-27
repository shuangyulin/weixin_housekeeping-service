package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 帖子信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
@TableName("tiezixinxi")
public class TiezixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiezixinxiEntity() {
		
	}
	
	public TiezixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 帖子主题
	 */
					
	private String tiezizhuti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：帖子主题
	 */
	public void setTiezizhuti(String tiezizhuti) {
		this.tiezizhuti = tiezizhuti;
	}
	/**
	 * 获取：帖子主题
	 */
	public String getTiezizhuti() {
		return tiezizhuti;
	}
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
