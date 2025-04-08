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


import com.dao.TingchechangxinxiDao;
import com.entity.TingchechangxinxiEntity;
import com.service.TingchechangxinxiService;
import com.entity.vo.TingchechangxinxiVO;
import com.entity.view.TingchechangxinxiView;

@Service("tingchechangxinxiService")
public class TingchechangxinxiServiceImpl extends ServiceImpl<TingchechangxinxiDao, TingchechangxinxiEntity> implements TingchechangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchechangxinxiEntity> page = this.selectPage(
                new Query<TingchechangxinxiEntity>(params).getPage(),
                new EntityWrapper<TingchechangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchechangxinxiEntity> wrapper) {
		  Page<TingchechangxinxiView> page =new Query<TingchechangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchechangxinxiVO> selectListVO(Wrapper<TingchechangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchechangxinxiVO selectVO(Wrapper<TingchechangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchechangxinxiView> selectListView(Wrapper<TingchechangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchechangxinxiView selectView(Wrapper<TingchechangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
