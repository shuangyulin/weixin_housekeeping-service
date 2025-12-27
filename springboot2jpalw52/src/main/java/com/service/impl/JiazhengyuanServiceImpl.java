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


import com.dao.JiazhengyuanDao;
import com.entity.JiazhengyuanEntity;
import com.service.JiazhengyuanService;
import com.entity.vo.JiazhengyuanVO;
import com.entity.view.JiazhengyuanView;

@Service("jiazhengyuanService")
public class JiazhengyuanServiceImpl extends ServiceImpl<JiazhengyuanDao, JiazhengyuanEntity> implements JiazhengyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengyuanEntity> page = this.selectPage(
                new Query<JiazhengyuanEntity>(params).getPage(),
                new EntityWrapper<JiazhengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengyuanEntity> wrapper) {
		  Page<JiazhengyuanView> page =new Query<JiazhengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiazhengyuanVO> selectListVO(Wrapper<JiazhengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengyuanVO selectVO(Wrapper<JiazhengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengyuanView> selectListView(Wrapper<JiazhengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengyuanView selectView(Wrapper<JiazhengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
