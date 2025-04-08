package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhubaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhubaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhubaoxiuView;


/**
 * 业主报修
 *
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface YezhubaoxiuService extends IService<YezhubaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhubaoxiuVO> selectListVO(Wrapper<YezhubaoxiuEntity> wrapper);
   	
   	YezhubaoxiuVO selectVO(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
   	
   	List<YezhubaoxiuView> selectListView(Wrapper<YezhubaoxiuEntity> wrapper);
   	
   	YezhubaoxiuView selectView(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhubaoxiuEntity> wrapper);
   	
}

