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


import com.dao.DingdantixingDao;
import com.entity.DingdantixingEntity;
import com.service.DingdantixingService;
import com.entity.vo.DingdantixingVO;
import com.entity.view.DingdantixingView;

@Service("dingdantixingService")
public class DingdantixingServiceImpl extends ServiceImpl<DingdantixingDao, DingdantixingEntity> implements DingdantixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdantixingEntity> page = this.selectPage(
                new Query<DingdantixingEntity>(params).getPage(),
                new EntityWrapper<DingdantixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdantixingEntity> wrapper) {
		  Page<DingdantixingView> page =new Query<DingdantixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DingdantixingVO> selectListVO(Wrapper<DingdantixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdantixingVO selectVO(Wrapper<DingdantixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdantixingView> selectListView(Wrapper<DingdantixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdantixingView selectView(Wrapper<DingdantixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
