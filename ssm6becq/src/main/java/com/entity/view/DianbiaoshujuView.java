package com.entity.view;

import com.entity.DianbiaoshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电表数据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("dianbiaoshuju")
public class DianbiaoshujuView  extends DianbiaoshujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianbiaoshujuView(){
	}
 
 	public DianbiaoshujuView(DianbiaoshujuEntity dianbiaoshujuEntity){
 	try {
			BeanUtils.copyProperties(this, dianbiaoshujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
