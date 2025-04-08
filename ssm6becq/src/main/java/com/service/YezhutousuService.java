package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhutousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhutousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhutousuView;


/**
 * 业主投诉
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface YezhutousuService extends IService<YezhutousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhutousuVO> selectListVO(Wrapper<YezhutousuEntity> wrapper);
   	
   	YezhutousuVO selectVO(@Param("ew") Wrapper<YezhutousuEntity> wrapper);
   	
   	List<YezhutousuView> selectListView(Wrapper<YezhutousuEntity> wrapper);
   	
   	YezhutousuView selectView(@Param("ew") Wrapper<YezhutousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhutousuEntity> wrapper);
   	
}

