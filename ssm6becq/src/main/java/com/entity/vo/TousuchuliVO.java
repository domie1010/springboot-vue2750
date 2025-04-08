package com.entity.vo;

import com.entity.TousuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 投诉处理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class TousuchuliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业主姓名
	 */
	
	private String yezhuxingming;
		
	/**
	 * 楼房号
	 */
	
	private String loufanghao;
		
	/**
	 * 投诉项目
	 */
	
	private String tousuxiangmu;
		
	/**
	 * 投诉内容
	 */
	
	private String tousuneirong;
		
	/**
	 * 处理内容
	 */
	
	private String chulineirong;
		
	/**
	 * 处理结果
	 */
	
	private String chulijieguo;
		
	/**
	 * 处理时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chulishijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：业主姓名
	 */
	 
	public void setYezhuxingming(String yezhuxingming) {
		this.yezhuxingming = yezhuxingming;
	}
	
	/**
	 * 获取：业主姓名
	 */
	public String getYezhuxingming() {
		return yezhuxingming;
	}
				
	
	/**
	 * 设置：楼房号
	 */
	 
	public void setLoufanghao(String loufanghao) {
		this.loufanghao = loufanghao;
	}
	
	/**
	 * 获取：楼房号
	 */
	public String getLoufanghao() {
		return loufanghao;
	}
				
	
	/**
	 * 设置：投诉项目
	 */
	 
	public void setTousuxiangmu(String tousuxiangmu) {
		this.tousuxiangmu = tousuxiangmu;
	}
	
	/**
	 * 获取：投诉项目
	 */
	public String getTousuxiangmu() {
		return tousuxiangmu;
	}
				
	
	/**
	 * 设置：投诉内容
	 */
	 
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
				
	
	/**
	 * 设置：处理内容
	 */
	 
	public void setChulineirong(String chulineirong) {
		this.chulineirong = chulineirong;
	}
	
	/**
	 * 获取：处理内容
	 */
	public String getChulineirong() {
		return chulineirong;
	}
				
	
	/**
	 * 设置：处理结果
	 */
	 
	public void setChulijieguo(String chulijieguo) {
		this.chulijieguo = chulijieguo;
	}
	
	/**
	 * 获取：处理结果
	 */
	public String getChulijieguo() {
		return chulijieguo;
	}
				
	
	/**
	 * 设置：处理时间
	 */
	 
	public void setChulishijian(Date chulishijian) {
		this.chulishijian = chulishijian;
	}
	
	/**
	 * 获取：处理时间
	 */
	public Date getChulishijian() {
		return chulishijian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
