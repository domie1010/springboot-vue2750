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


import com.dao.YezhutousuDao;
import com.entity.YezhutousuEntity;
import com.service.YezhutousuService;
import com.entity.vo.YezhutousuVO;
import com.entity.view.YezhutousuView;

@Service("yezhutousuService")
public class YezhutousuServiceImpl extends ServiceImpl<YezhutousuDao, YezhutousuEntity> implements YezhutousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhutousuEntity> page = this.selectPage(
                new Query<YezhutousuEntity>(params).getPage(),
                new EntityWrapper<YezhutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhutousuEntity> wrapper) {
		  Page<YezhutousuView> page =new Query<YezhutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhutousuVO> selectListVO(Wrapper<YezhutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhutousuVO selectVO(Wrapper<YezhutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhutousuView> selectListView(Wrapper<YezhutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhutousuView selectView(Wrapper<YezhutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
