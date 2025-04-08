package com.dao;

import com.entity.ShuibiaoshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuibiaoshujuVO;
import com.entity.view.ShuibiaoshujuView;


/**
 * 水表数据
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface ShuibiaoshujuDao extends BaseMapper<ShuibiaoshujuEntity> {
	
	List<ShuibiaoshujuVO> selectListVO(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
	
	ShuibiaoshujuVO selectVO(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
	
	List<ShuibiaoshujuView> selectListView(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);

	List<ShuibiaoshujuView> selectListView(Pagination page,@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
	
	ShuibiaoshujuView selectView(@Param("ew") Wrapper<ShuibiaoshujuEntity> wrapper);
	
}
