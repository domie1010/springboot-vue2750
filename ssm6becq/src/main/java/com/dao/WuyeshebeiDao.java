package com.dao;

import com.entity.WuyeshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeshebeiVO;
import com.entity.view.WuyeshebeiView;


/**
 * 物业设备
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface WuyeshebeiDao extends BaseMapper<WuyeshebeiEntity> {
	
	List<WuyeshebeiVO> selectListVO(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
	
	WuyeshebeiVO selectVO(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
	
	List<WuyeshebeiView> selectListView(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);

	List<WuyeshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
	
	WuyeshebeiView selectView(@Param("ew") Wrapper<WuyeshebeiEntity> wrapper);
	
}
