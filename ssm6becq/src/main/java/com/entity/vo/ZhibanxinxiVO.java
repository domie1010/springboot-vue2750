package com.entity.vo;

import com.entity.ZhibanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 值班信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class ZhibanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 值班区域
	 */
	
	private String zhibanquyu;
		
	/**
	 * 班次
	 */
	
	private String banci;
		
	/**
	 * 值班内容
	 */
	
	private String zhibanneirong;
		
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
	 * 备注
	 */
	
	private String beizhu;
				
	
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
				
	
	/**
	 * 设置：值班区域
	 */
	 
	public void setZhibanquyu(String zhibanquyu) {
		this.zhibanquyu = zhibanquyu;
	}
	
	/**
	 * 获取：值班区域
	 */
	public String getZhibanquyu() {
		return zhibanquyu;
	}
				
	
	/**
	 * 设置：班次
	 */
	 
	public void setBanci(String banci) {
		this.banci = banci;
	}
	
	/**
	 * 获取：班次
	 */
	public String getBanci() {
		return banci;
	}
				
	
	/**
	 * 设置：值班内容
	 */
	 
	public void setZhibanneirong(String zhibanneirong) {
		this.zhibanneirong = zhibanneirong;
	}
	
	/**
	 * 获取：值班内容
	 */
	public String getZhibanneirong() {
		return zhibanneirong;
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
			
}
