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
 * 停车场信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("tingchechangxinxi")
public class TingchechangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TingchechangxinxiEntity() {
		
	}
	
	public TingchechangxinxiEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 停车场区域
	 */
					
	private String tingchechangquyu;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 停车场图片
	 */
					
	private String tingchechangtupian;
	
	
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
	 * 设置：停车场区域
	 */
	public void setTingchechangquyu(String tingchechangquyu) {
		this.tingchechangquyu = tingchechangquyu;
	}
	/**
	 * 获取：停车场区域
	 */
	public String getTingchechangquyu() {
		return tingchechangquyu;
	}
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
