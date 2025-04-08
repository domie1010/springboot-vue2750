package com.entity.vo;

import com.entity.ShequhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 社区活动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class ShequhuodongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动场地
	 */
	
	private String huodongchangdi;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 活动人数
	 */
	
	private Integer huodongrenshu;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 报名说明
	 */
	
	private String baomingshuoming;
				
	
	/**
	 * 设置：活动场地
	 */
	 
	public void setHuodongchangdi(String huodongchangdi) {
		this.huodongchangdi = huodongchangdi;
	}
	
	/**
	 * 获取：活动场地
	 */
	public String getHuodongchangdi() {
		return huodongchangdi;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
				
	
	/**
	 * 设置：活动人数
	 */
	 
	public void setHuodongrenshu(Integer huodongrenshu) {
		this.huodongrenshu = huodongrenshu;
	}
	
	/**
	 * 获取：活动人数
	 */
	public Integer getHuodongrenshu() {
		return huodongrenshu;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：报名说明
	 */
	 
	public void setBaomingshuoming(String baomingshuoming) {
		this.baomingshuoming = baomingshuoming;
	}
	
	/**
	 * 获取：报名说明
	 */
	public String getBaomingshuoming() {
		return baomingshuoming;
	}
			
}
