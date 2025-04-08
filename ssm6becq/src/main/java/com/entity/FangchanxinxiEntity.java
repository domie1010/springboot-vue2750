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
 * 房产信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("fangchanxinxi")
public class FangchanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangchanxinxiEntity() {
		
	}
	
	public FangchanxinxiEntity(T t) {
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
	 * 业主账号
	 */
					
	private String yezhuzhanghao;
	
	/**
	 * 业主姓名
	 */
					
	private String yezhuxingming;
	
	/**
	 * 楼房号
	 */
					
	private String loufanghao;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 装修情况
	 */
					
	private String zhuangxiuqingkuang;
	
	/**
	 * 朝向
	 */
					
	private String chaoxiang;
	
	/**
	 * 购买价格
	 */
					
	private Integer goumaijiage;
	
	/**
	 * 入住日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhuriqi;
	
	/**
	 * 合同文件
	 */
					
	private String hetongwenjian;
	
	
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
	 * 设置：业主账号
	 */
	public void setYezhuzhanghao(String yezhuzhanghao) {
		this.yezhuzhanghao = yezhuzhanghao;
	}
	/**
	 * 获取：业主账号
	 */
	public String getYezhuzhanghao() {
		return yezhuzhanghao;
	}
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
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：装修情况
	 */
	public void setZhuangxiuqingkuang(String zhuangxiuqingkuang) {
		this.zhuangxiuqingkuang = zhuangxiuqingkuang;
	}
	/**
	 * 获取：装修情况
	 */
	public String getZhuangxiuqingkuang() {
		return zhuangxiuqingkuang;
	}
	/**
	 * 设置：朝向
	 */
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	/**
	 * 获取：朝向
	 */
	public String getChaoxiang() {
		return chaoxiang;
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
	 * 设置：入住日期
	 */
	public void setRuzhuriqi(Date ruzhuriqi) {
		this.ruzhuriqi = ruzhuriqi;
	}
	/**
	 * 获取：入住日期
	 */
	public Date getRuzhuriqi() {
		return ruzhuriqi;
	}
	/**
	 * 设置：合同文件
	 */
	public void setHetongwenjian(String hetongwenjian) {
		this.hetongwenjian = hetongwenjian;
	}
	/**
	 * 获取：合同文件
	 */
	public String getHetongwenjian() {
		return hetongwenjian;
	}

}
