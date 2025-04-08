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


import com.dao.ShuibiaoshujuDao;
import com.entity.ShuibiaoshujuEntity;
import com.service.ShuibiaoshujuService;
import com.entity.vo.ShuibiaoshujuVO;
import com.entity.view.ShuibiaoshujuView;

@Service("shuibiaoshujuService")
public class ShuibiaoshujuServiceImpl extends ServiceImpl<ShuibiaoshujuDao, ShuibiaoshujuEntity> implements ShuibiaoshujuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuibiaoshujuEntity> page = this.selectPage(
                new Query<ShuibiaoshujuEntity>(params).getPage(),
                new EntityWrapper<ShuibiaoshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuibiaoshujuEntity> wrapper) {
		  Page<ShuibiaoshujuView> page =new Query<ShuibiaoshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuibiaoshujuVO> selectListVO(Wrapper<ShuibiaoshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuibiaoshujuVO selectVO(Wrapper<ShuibiaoshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuibiaoshujuView> selectListView(Wrapper<ShuibiaoshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuibiaoshujuView selectView(Wrapper<ShuibiaoshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
