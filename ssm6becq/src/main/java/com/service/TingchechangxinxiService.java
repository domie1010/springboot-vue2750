package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchechangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchechangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchechangxinxiView;


/**
 * 停车场信息
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface TingchechangxinxiService extends IService<TingchechangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchechangxinxiVO> selectListVO(Wrapper<TingchechangxinxiEntity> wrapper);
   	
   	TingchechangxinxiVO selectVO(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
   	
   	List<TingchechangxinxiView> selectListView(Wrapper<TingchechangxinxiEntity> wrapper);
   	
   	TingchechangxinxiView selectView(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchechangxinxiEntity> wrapper);
   	
}

