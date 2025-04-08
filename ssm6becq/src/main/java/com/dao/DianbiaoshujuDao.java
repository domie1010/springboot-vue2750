package com.dao;

import com.entity.DianbiaoshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianbiaoshujuVO;
import com.entity.view.DianbiaoshujuView;


/**
 * 电表数据
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface DianbiaoshujuDao extends BaseMapper<DianbiaoshujuEntity> {
	
	List<DianbiaoshujuVO> selectListVO(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
	
	DianbiaoshujuVO selectVO(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
	
	List<DianbiaoshujuView> selectListView(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);

	List<DianbiaoshujuView> selectListView(Pagination page,@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
	
	DianbiaoshujuView selectView(@Param("ew") Wrapper<DianbiaoshujuEntity> wrapper);
	
}
