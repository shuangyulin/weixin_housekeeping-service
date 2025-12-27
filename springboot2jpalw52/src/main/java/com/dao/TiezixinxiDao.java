package com.dao;

import com.entity.TiezixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiezixinxiVO;
import com.entity.view.TiezixinxiView;


/**
 * 帖子信息
 * 
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface TiezixinxiDao extends BaseMapper<TiezixinxiEntity> {
	
	List<TiezixinxiVO> selectListVO(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);
	
	TiezixinxiVO selectVO(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);
	
	List<TiezixinxiView> selectListView(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);

	List<TiezixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TiezixinxiEntity> wrapper);

	
	TiezixinxiView selectView(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);
	

}
