package com.dao;

import com.entity.YezhutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhutousuVO;
import com.entity.view.YezhutousuView;


/**
 * 业主投诉
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface YezhutousuDao extends BaseMapper<YezhutousuEntity> {
	
	List<YezhutousuVO> selectListVO(@Param("ew") Wrapper<YezhutousuEntity> wrapper);
	
	YezhutousuVO selectVO(@Param("ew") Wrapper<YezhutousuEntity> wrapper);
	
	List<YezhutousuView> selectListView(@Param("ew") Wrapper<YezhutousuEntity> wrapper);

	List<YezhutousuView> selectListView(Pagination page,@Param("ew") Wrapper<YezhutousuEntity> wrapper);
	
	YezhutousuView selectView(@Param("ew") Wrapper<YezhutousuEntity> wrapper);
	
}
