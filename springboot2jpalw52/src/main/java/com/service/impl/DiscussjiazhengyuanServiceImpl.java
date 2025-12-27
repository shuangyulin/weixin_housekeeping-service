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


import com.dao.DiscussjiazhengyuanDao;
import com.entity.DiscussjiazhengyuanEntity;
import com.service.DiscussjiazhengyuanService;
import com.entity.vo.DiscussjiazhengyuanVO;
import com.entity.view.DiscussjiazhengyuanView;

@Service("discussjiazhengyuanService")
public class DiscussjiazhengyuanServiceImpl extends ServiceImpl<DiscussjiazhengyuanDao, DiscussjiazhengyuanEntity> implements DiscussjiazhengyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiazhengyuanEntity> page = this.selectPage(
                new Query<DiscussjiazhengyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussjiazhengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiazhengyuanEntity> wrapper) {
		  Page<DiscussjiazhengyuanView> page =new Query<DiscussjiazhengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussjiazhengyuanVO> selectListVO(Wrapper<DiscussjiazhengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiazhengyuanVO selectVO(Wrapper<DiscussjiazhengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiazhengyuanView> selectListView(Wrapper<DiscussjiazhengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiazhengyuanView selectView(Wrapper<DiscussjiazhengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
