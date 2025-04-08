package com.entity.vo;

import com.entity.WuyeshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物业设备
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class WuyeshebeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备位置
	 */
	
	private String shebeiweizhi;
		
	/**
	 * 设备类型
	 */
	
	private String shebeileixing;
		
	/**
	 * 设备介绍
	 */
	
	private String shebeijieshao;
		
	/**
	 * 设备数量
	 */
	
	private Integer shebeishuliang;
		
	/**
	 * 购买价格
	 */
	
	private Integer goumaijiage;
		
	/**
	 * 安装日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date anzhuangriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：设备位置
	 */
	 
	public void setShebeiweizhi(String shebeiweizhi) {
		this.shebeiweizhi = shebeiweizhi;
	}
	
	/**
	 * 获取：设备位置
	 */
	public String getShebeiweizhi() {
		return shebeiweizhi;
	}
				
	
	/**
	 * 设置：设备类型
	 */
	 
	public void setShebeileixing(String shebeileixing) {
		this.shebeileixing = shebeileixing;
	}
	
	/**
	 * 获取：设备类型
	 */
	public String getShebeileixing() {
		return shebeileixing;
	}
				
	
	/**
	 * 设置：设备介绍
	 */
	 
	public void setShebeijieshao(String shebeijieshao) {
		this.shebeijieshao = shebeijieshao;
	}
	
	/**
	 * 获取：设备介绍
	 */
	public String getShebeijieshao() {
		return shebeijieshao;
	}
				
	
	/**
	 * 设置：设备数量
	 */
	 
	public void setShebeishuliang(Integer shebeishuliang) {
		this.shebeishuliang = shebeishuliang;
	}
	
	/**
	 * 获取：设备数量
	 */
	public Integer getShebeishuliang() {
		return shebeishuliang;
	}
				
	
	/**
	 * 设置：购买价格
	 */
	 
	public void setGoumaijiage(Integer goumaijiage) {
		this.goumaijiage = goumaijiage;
	}
	
	/**
	 * 获取：购买价格
	 */
	public Integer getGoumaijiage() {
		return goumaijiage;
	}
				
	
	/**
	 * 设置：安装日期
	 */
	 
	public void setAnzhuangriqi(Date anzhuangriqi) {
		this.anzhuangriqi = anzhuangriqi;
	}
	
	/**
	 * 获取：安装日期
	 */
	public Date getAnzhuangriqi() {
		return anzhuangriqi;
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
