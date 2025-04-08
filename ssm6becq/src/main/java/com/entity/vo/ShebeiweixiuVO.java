package com.entity.vo;

import com.entity.ShebeiweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备维修
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class ShebeiweixiuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备类型
	 */
	
	private String shebeileixing;
		
	/**
	 * 维修项目
	 */
	
	private String weixiuxiangmu;
		
	/**
	 * 维修原因
	 */
	
	private String weixiuyuanyin;
		
	/**
	 * 维修结果
	 */
	
	private String weixiujieguo;
		
	/**
	 * 维修日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weixiuriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
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
	 * 设置：维修项目
	 */
	 
	public void setWeixiuxiangmu(String weixiuxiangmu) {
		this.weixiuxiangmu = weixiuxiangmu;
	}
	
	/**
	 * 获取：维修项目
	 */
	public String getWeixiuxiangmu() {
		return weixiuxiangmu;
	}
				
	
	/**
	 * 设置：维修原因
	 */
	 
	public void setWeixiuyuanyin(String weixiuyuanyin) {
		this.weixiuyuanyin = weixiuyuanyin;
	}
	
	/**
	 * 获取：维修原因
	 */
	public String getWeixiuyuanyin() {
		return weixiuyuanyin;
	}
				
	
	/**
	 * 设置：维修结果
	 */
	 
	public void setWeixiujieguo(String weixiujieguo) {
		this.weixiujieguo = weixiujieguo;
	}
	
	/**
	 * 获取：维修结果
	 */
	public String getWeixiujieguo() {
		return weixiujieguo;
	}
				
	
	/**
	 * 设置：维修日期
	 */
	 
	public void setWeixiuriqi(Date weixiuriqi) {
		this.weixiuriqi = weixiuriqi;
	}
	
	/**
	 * 获取：维修日期
	 */
	public Date getWeixiuriqi() {
		return weixiuriqi;
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
