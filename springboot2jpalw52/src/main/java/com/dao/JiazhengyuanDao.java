package com.dao;

import com.entity.JiazhengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengyuanVO;
import com.entity.view.JiazhengyuanView;


/**
 * 家政员
 * 
 * @author 
 * @email 
 * @date 2024-08-19 15:22:25
 */
public interface JiazhengyuanDao extends BaseMapper<JiazhengyuanEntity> {
	
	List<JiazhengyuanVO> selectListVO(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);
	
	JiazhengyuanVO selectVO(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);
	
	List<JiazhengyuanView> selectListView(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);

	List<JiazhengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);

	
	JiazhengyuanView selectView(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);
	

}
