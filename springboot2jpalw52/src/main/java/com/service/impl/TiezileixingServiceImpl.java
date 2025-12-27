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


import com.dao.TiezileixingDao;
import com.entity.TiezileixingEntity;
import com.service.TiezileixingService;
import com.entity.vo.TiezileixingVO;
import com.entity.view.TiezileixingView;

@Service("tiezileixingService")
public class TiezileixingServiceImpl extends ServiceImpl<TiezileixingDao, TiezileixingEntity> implements TiezileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiezileixingEntity> page = this.selectPage(
                new Query<TiezileixingEntity>(params).getPage(),
                new EntityWrapper<TiezileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiezileixingEntity> wrapper) {
		  Page<TiezileixingView> page =new Query<TiezileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TiezileixingVO> selectListVO(Wrapper<TiezileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiezileixingVO selectVO(Wrapper<TiezileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiezileixingView> selectListView(Wrapper<TiezileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiezileixingView selectView(Wrapper<TiezileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
