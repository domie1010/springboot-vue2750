package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeshebeiView;


/**
 * 物业设备
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface WuyeshebeiService extends IService<WuyeshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeshebeiVO> selectListVO(Wrapper<WuyeshebeiEntity> wrapper);
   	
   	WuyeshebeiVO selectVO(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
   	
   	List<WuyeshebeiView> selectListView(Wrapper<WuyeshebeiEntity> wrapper);
   	
   	WuyeshebeiView selectView(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeshebeiEntity> wrapper);
   	
}

