package com.dao;

import com.entity.WuyeyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeyuangongVO;
import com.entity.view.WuyeyuangongView;


/**
 * 物业员工
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface WuyeyuangongDao extends BaseMapper<WuyeyuangongEntity> {
	
	List<WuyeyuangongVO> selectListVO(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
	
	WuyeyuangongVO selectVO(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
	
	List<WuyeyuangongView> selectListView(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);

	List<WuyeyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
	
	WuyeyuangongView selectView(@Param("ew") Wrapper<WuyeyuangongEntity> wrapper);
	
}
