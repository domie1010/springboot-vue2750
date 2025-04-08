package com.dao;

import com.entity.YezhubaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhubaoxiuVO;
import com.entity.view.YezhubaoxiuView;


/**
 * 业主报修
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface YezhubaoxiuDao extends BaseMapper<YezhubaoxiuEntity> {
	
	List<YezhubaoxiuVO> selectListVO(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
	
	YezhubaoxiuVO selectVO(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
	
	List<YezhubaoxiuView> selectListView(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);

	List<YezhubaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
	
	YezhubaoxiuView selectView(@Param("ew") Wrapper<YezhubaoxiuEntity> wrapper);
	
}
