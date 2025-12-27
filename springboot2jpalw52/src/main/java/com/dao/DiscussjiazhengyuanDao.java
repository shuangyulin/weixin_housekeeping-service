package com.dao;

import com.entity.DiscussjiazhengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiazhengyuanVO;
import com.entity.view.DiscussjiazhengyuanView;


/**
 * 家政员评论表
 * 
 * @author 
 * @email 
 * @date 2024-08-19 15:22:27
 */
public interface DiscussjiazhengyuanDao extends BaseMapper<DiscussjiazhengyuanEntity> {
	
	List<DiscussjiazhengyuanVO> selectListVO(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);
	
	DiscussjiazhengyuanVO selectVO(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);
	
	List<DiscussjiazhengyuanView> selectListView(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);

	List<DiscussjiazhengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);

	
	DiscussjiazhengyuanView selectView(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);
	

}
