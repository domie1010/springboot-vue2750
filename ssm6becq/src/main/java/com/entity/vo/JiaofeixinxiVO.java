package com.entity.vo;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缴费信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class JiaofeixinxiVO  implements Serializable {
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
	 * 缴费单号
	 */
	
	private String jiaofeidanhao;
		
	/**
	 * 缴费类型
	 */
	
	private String jiaofeileixing;
		
	/**
	 * 缴费金额
	 */
	
	private Integer jiaofeijine;
		
	/**
	 * 开单日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaidanriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：缴费单号
	 */
	 
	public void setJiaofeidanhao(String jiaofeidanhao) {
		this.jiaofeidanhao = jiaofeidanhao;
	}
	
	/**
	 * 获取：缴费单号
	 */
	public String getJiaofeidanhao() {
		return jiaofeidanhao;
	}
				
	
	/**
	 * 设置：缴费类型
	 */
	 
	public void setJiaofeileixing(String jiaofeileixing) {
		this.jiaofeileixing = jiaofeileixing;
	}
	
	/**
	 * 获取：缴费类型
	 */
	public String getJiaofeileixing() {
		return jiaofeileixing;
	}
				
	
	/**
	 * 设置：缴费金额
	 */
	 
	public void setJiaofeijine(Integer jiaofeijine) {
		this.jiaofeijine = jiaofeijine;
	}
	
	/**
	 * 获取：缴费金额
	 */
	public Integer getJiaofeijine() {
		return jiaofeijine;
	}
				
	
	/**
	 * 设置：开单日期
	 */
	 
	public void setKaidanriqi(Date kaidanriqi) {
		this.kaidanriqi = kaidanriqi;
	}
	
	/**
	 * 获取：开单日期
	 */
	public Date getKaidanriqi() {
		return kaidanriqi;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
