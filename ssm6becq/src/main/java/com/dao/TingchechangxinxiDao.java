package com.dao;

import com.entity.TingchechangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchechangxinxiVO;
import com.entity.view.TingchechangxinxiView;


/**
 * 停车场信息
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface TingchechangxinxiDao extends BaseMapper<TingchechangxinxiEntity> {
	
	List<TingchechangxinxiVO> selectListVO(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
	
	TingchechangxinxiVO selectVO(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
	
	List<TingchechangxinxiView> selectListView(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);

	List<TingchechangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
	
	TingchechangxinxiView selectView(@Param("ew") Wrapper<TingchechangxinxiEntity> wrapper);
	
}
