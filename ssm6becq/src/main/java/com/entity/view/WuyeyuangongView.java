package com.entity.view;

import com.entity.WuyeyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业员工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("wuyeyuangong")
public class WuyeyuangongView  extends WuyeyuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyeyuangongView(){
	}
 
 	public WuyeyuangongView(WuyeyuangongEntity wuyeyuangongEntity){
 	try {
			BeanUtils.copyProperties(this, wuyeyuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
