package com.dao;

import com.entity.ZhibanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibanxinxiVO;
import com.entity.view.ZhibanxinxiView;


/**
 * 值班信息
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface ZhibanxinxiDao extends BaseMapper<ZhibanxinxiEntity> {
	
	List<ZhibanxinxiVO> selectListVO(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
	
	ZhibanxinxiVO selectVO(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
	
	List<ZhibanxinxiView> selectListView(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);

	List<ZhibanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
	
	ZhibanxinxiView selectView(@Param("ew") Wrapper<ZhibanxinxiEntity> wrapper);
	
}
