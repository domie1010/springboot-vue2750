package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianbiaoshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianbiaoshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianbiaoshujuView;


/**
 * 电表数据
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface DianbiaoshujuService extends IService<DianbiaoshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianbiaoshujuVO> selectListVO(Wrapper<DianbiaoshujuEntity> wrapper);
   	
   	DianbiaoshujuVO selectVO(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
   	
   	List<DianbiaoshujuView> selectListView(Wrapper<DianbiaoshujuEntity> wrapper);
   	
   	DianbiaoshujuView selectView(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianbiaoshujuEntity> wrapper);
   	
}

