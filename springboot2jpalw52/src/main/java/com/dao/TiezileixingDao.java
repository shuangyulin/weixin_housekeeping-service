package com.dao;

import com.entity.TiezileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiezileixingVO;
import com.entity.view.TiezileixingView;


/**
 * 帖子类型
 * 
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface TiezileixingDao extends BaseMapper<TiezileixingEntity> {
	
	List<TiezileixingVO> selectListVO(@Param("ew") Wrapper<TiezileixingEntity> wrapper);
	
	TiezileixingVO selectVO(@Param("ew") Wrapper<TiezileixingEntity> wrapper);
	
	List<TiezileixingView> selectListView(@Param("ew") Wrapper<TiezileixingEntity> wrapper);

	List<TiezileixingView> selectListView(Pagination page,@Param("ew") Wrapper<TiezileixingEntity> wrapper);

	
	TiezileixingView selectView(@Param("ew") Wrapper<TiezileixingEntity> wrapper);
	

}
