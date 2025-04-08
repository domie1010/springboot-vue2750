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
 * 物业设备
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("wuyeshebei")
public class WuyeshebeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuyeshebeiEntity() {
		
	}
	
	public WuyeshebeiEntity(T t) {
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
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date anzhuangriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：设备名称
	 */
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
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
