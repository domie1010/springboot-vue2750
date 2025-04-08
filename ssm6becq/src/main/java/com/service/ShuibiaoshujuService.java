package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuibiaoshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuibiaoshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuibiaoshujuView;


/**
 * 水表数据
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface ShuibiaoshujuService extends IService<ShuibiaoshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuibiaoshujuVO> selectListVO(Wrapper<ShuibiaoshujuEntity> wrapper);
   	
   	ShuibiaoshujuVO selectVO(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
   	
   	List<ShuibiaoshujuView> selectListView(Wrapper<ShuibiaoshujuEntity> wrapper);
   	
   	ShuibiaoshujuView selectView(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuibiaoshujuEntity> wrapper);
   	
}

