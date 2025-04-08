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


import com.dao.ZhibanxinxiDao;
import com.entity.ZhibanxinxiEntity;
import com.service.ZhibanxinxiService;
import com.entity.vo.ZhibanxinxiVO;
import com.entity.view.ZhibanxinxiView;

@Service("zhibanxinxiService")
public class ZhibanxinxiServiceImpl extends ServiceImpl<ZhibanxinxiDao, ZhibanxinxiEntity> implements ZhibanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibanxinxiEntity> page = this.selectPage(
                new Query<ZhibanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhibanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibanxinxiEntity> wrapper) {
		  Page<ZhibanxinxiView> page =new Query<ZhibanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibanxinxiVO> selectListVO(Wrapper<ZhibanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibanxinxiVO selectVO(Wrapper<ZhibanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibanxinxiView> selectListView(Wrapper<ZhibanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibanxinxiView selectView(Wrapper<ZhibanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
