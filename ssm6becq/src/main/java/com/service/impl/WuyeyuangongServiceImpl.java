package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WuyeyuangongDao;
import com.entity.WuyeyuangongEntity;
import com.service.WuyeyuangongService;
import com.entity.vo.WuyeyuangongVO;
import com.entity.view.WuyeyuangongView;

@Service("wuyeyuangongService")
public class WuyeyuangongServiceImpl extends ServiceImpl<WuyeyuangongDao, WuyeyuangongEntity> implements WuyeyuangongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeyuangongEntity> page = this.selectPage(
                new Query<WuyeyuangongEntity>(params).getPage(),
                new EntityWrapper<WuyeyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeyuangongEntity> wrapper) {
		  Page<WuyeyuangongView> page =new Query<WuyeyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeyuangongVO> selectListVO(Wrapper<WuyeyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeyuangongVO selectVO(Wrapper<WuyeyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeyuangongView> selectListView(Wrapper<WuyeyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeyuangongView selectView(Wrapper<WuyeyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
