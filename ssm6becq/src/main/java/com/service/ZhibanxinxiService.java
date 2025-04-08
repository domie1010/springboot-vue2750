package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibanxinxiView;


/**
 * 值班信息
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface ZhibanxinxiService extends IService<ZhibanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibanxinxiVO> selectListVO(Wrapper<ZhibanxinxiEntity> wrapper);
   	
   	ZhibanxinxiVO selectVO(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
   	
   	List<ZhibanxinxiView> selectListView(Wrapper<ZhibanxinxiEntity> wrapper);
   	
   	ZhibanxinxiView selectView(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibanxinxiEntity> wrapper);
   	
}

