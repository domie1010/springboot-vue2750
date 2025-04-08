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
 * 设备维修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("shebeiweixiu")
public class ShebeiweixiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeiweixiuEntity() {
		
	}
	
	public ShebeiweixiuEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
