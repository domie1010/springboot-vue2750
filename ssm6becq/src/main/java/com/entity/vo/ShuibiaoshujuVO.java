package com.entity.vo;

import com.entity.ShuibiaoshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 水表数据
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public class ShuibiaoshujuVO  implements Serializable {
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
	 * 仪表编号
	 */
	
	private String yibiaobianhao;
		
	/**
	 * 水表位数
	 */
	
	private Integer shuibiaoweishu;
		
	/**
	 * 用水吨数
	 */
	
	private Integer yongshuidunshu;
		
	/**
	 * 月份
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuefen;
		
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
	 * 设置：仪表编号
	 */
	 
	public void setYibiaobianhao(String yibiaobianhao) {
		this.yibiaobianhao = yibiaobianhao;
	}
	
	/**
	 * 获取：仪表编号
	 */
	public String getYibiaobianhao() {
		return yibiaobianhao;
	}
				
	
	/**
	 * 设置：水表位数
	 */
	 
	public void setShuibiaoweishu(Integer shuibiaoweishu) {
		this.shuibiaoweishu = shuibiaoweishu;
	}
	
	/**
	 * 获取：水表位数
	 */
	public Integer getShuibiaoweishu() {
		return shuibiaoweishu;
	}
				
	
	/**
	 * 设置：用水吨数
	 */
	 
	public void setYongshuidunshu(Integer yongshuidunshu) {
		this.yongshuidunshu = yongshuidunshu;
	}
	
	/**
	 * 获取：用水吨数
	 */
	public Integer getYongshuidunshu() {
		return yongshuidunshu;
	}
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(Date yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public Date getYuefen() {
		return yuefen;
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
