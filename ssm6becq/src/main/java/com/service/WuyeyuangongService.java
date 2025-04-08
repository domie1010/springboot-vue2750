package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeyuangongView;


/**
 * 物业员工
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface WuyeyuangongService extends IService<WuyeyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeyuangongVO> selectListVO(Wrapper<WuyeyuangongEntity> wrapper);
   	
   	WuyeyuangongVO selectVO(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
   	
   	List<WuyeyuangongView> selectListView(Wrapper<WuyeyuangongEntity> wrapper);
   	
   	WuyeyuangongView selectView(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeyuangongEntity> wrapper);
   	
}

