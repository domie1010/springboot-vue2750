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


import com.dao.DianbiaoshujuDao;
import com.entity.DianbiaoshujuEntity;
import com.service.DianbiaoshujuService;
import com.entity.vo.DianbiaoshujuVO;
import com.entity.view.DianbiaoshujuView;

@Service("dianbiaoshujuService")
public class DianbiaoshujuServiceImpl extends ServiceImpl<DianbiaoshujuDao, DianbiaoshujuEntity> implements DianbiaoshujuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianbiaoshujuEntity> page = this.selectPage(
                new Query<DianbiaoshujuEntity>(params).getPage(),
                new EntityWrapper<DianbiaoshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianbiaoshujuEntity> wrapper) {
		  Page<DianbiaoshujuView> page =new Query<DianbiaoshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianbiaoshujuVO> selectListVO(Wrapper<DianbiaoshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianbiaoshujuVO selectVO(Wrapper<DianbiaoshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianbiaoshujuView> selectListView(Wrapper<DianbiaoshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianbiaoshujuView selectView(Wrapper<DianbiaoshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
