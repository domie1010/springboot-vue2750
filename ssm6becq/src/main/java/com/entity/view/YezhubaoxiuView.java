package com.entity.view;

import com.entity.YezhubaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("yezhubaoxiu")
public class YezhubaoxiuView  extends YezhubaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhubaoxiuView(){
	}
 
 	public YezhubaoxiuView(YezhubaoxiuEntity yezhubaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, yezhubaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
