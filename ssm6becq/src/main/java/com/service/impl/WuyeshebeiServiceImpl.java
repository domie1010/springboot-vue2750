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


import com.dao.WuyeshebeiDao;
import com.entity.WuyeshebeiEntity;
import com.service.WuyeshebeiService;
import com.entity.vo.WuyeshebeiVO;
import com.entity.view.WuyeshebeiView;

@Service("wuyeshebeiService")
public class WuyeshebeiServiceImpl extends ServiceImpl<WuyeshebeiDao, WuyeshebeiEntity> implements WuyeshebeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeshebeiEntity> page = this.selectPage(
                new Query<WuyeshebeiEntity>(params).getPage(),
                new EntityWrapper<WuyeshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeshebeiEntity> wrapper) {
		  Page<WuyeshebeiView> page =new Query<WuyeshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeshebeiVO> selectListVO(Wrapper<WuyeshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeshebeiVO selectVO(Wrapper<WuyeshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeshebeiView> selectListView(Wrapper<WuyeshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeshebeiView selectView(Wrapper<WuyeshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
