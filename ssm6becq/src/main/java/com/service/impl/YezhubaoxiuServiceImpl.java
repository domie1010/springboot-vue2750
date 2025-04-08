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


import com.dao.YezhubaoxiuDao;
import com.entity.YezhubaoxiuEntity;
import com.service.YezhubaoxiuService;
import com.entity.vo.YezhubaoxiuVO;
import com.entity.view.YezhubaoxiuView;

@Service("yezhubaoxiuService")
public class YezhubaoxiuServiceImpl extends ServiceImpl<YezhubaoxiuDao, YezhubaoxiuEntity> implements YezhubaoxiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhubaoxiuEntity> page = this.selectPage(
                new Query<YezhubaoxiuEntity>(params).getPage(),
                new EntityWrapper<YezhubaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhubaoxiuEntity> wrapper) {
		  Page<YezhubaoxiuView> page =new Query<YezhubaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhubaoxiuVO> selectListVO(Wrapper<YezhubaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhubaoxiuVO selectVO(Wrapper<YezhubaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhubaoxiuView> selectListView(Wrapper<YezhubaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhubaoxiuView selectView(Wrapper<YezhubaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
