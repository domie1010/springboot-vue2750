package com.entity.vo;

import com.entity.TingchechangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 停车场信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class TingchechangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位数量
	 */
	
	private Integer cheweishuliang;
		
	/**
	 * 停车数量
	 */
	
	private Integer tingcheshuliang;
		
	/**
	 * 剩余车位
	 */
	
	private String shengyuchewei;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 停车场图片
	 */
	
	private String tingchechangtupian;
				
	
	/**
	 * 设置：车位数量
	 */
	 
	public void setCheweishuliang(Integer cheweishuliang) {
		this.cheweishuliang = cheweishuliang;
	}
	
	/**
	 * 获取：车位数量
	 */
	public Integer getCheweishuliang() {
		return cheweishuliang;
	}
				
	
	/**
	 * 设置：停车数量
	 */
	 
	public void setTingcheshuliang(Integer tingcheshuliang) {
		this.tingcheshuliang = tingcheshuliang;
	}
	
	/**
	 * 获取：停车数量
	 */
	public Integer getTingcheshuliang() {
		return tingcheshuliang;
	}
				
	
	/**
	 * 设置：剩余车位
	 */
	 
	public void setShengyuchewei(String shengyuchewei) {
		this.shengyuchewei = shengyuchewei;
	}
	
	/**
	 * 获取：剩余车位
	 */
	public String getShengyuchewei() {
		return shengyuchewei;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：停车场图片
	 */
	 
	public void setTingchechangtupian(String tingchechangtupian) {
		this.tingchechangtupian = tingchechangtupian;
	}
	
	/**
	 * 获取：停车场图片
	 */
	public String getTingchechangtupian() {
		return tingchechangtupian;
	}
			
}
