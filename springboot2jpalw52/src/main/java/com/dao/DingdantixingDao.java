package com.dao;

import com.entity.DingdantixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdantixingVO;
import com.entity.view.DingdantixingView;


/**
 * 订单提醒
 * 
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface DingdantixingDao extends BaseMapper<DingdantixingEntity> {
	
	List<DingdantixingVO> selectListVO(@Param("ew") Wrapper<DingdantixingEntity> wrapper);
	
	DingdantixingVO selectVO(@Param("ew") Wrapper<DingdantixingEntity> wrapper);
	
	List<DingdantixingView> selectListView(@Param("ew") Wrapper<DingdantixingEntity> wrapper);

	List<DingdantixingView> selectListView(Pagination page,@Param("ew") Wrapper<DingdantixingEntity> wrapper);

	
	DingdantixingView selectView(@Param("ew") Wrapper<DingdantixingEntity> wrapper);
	

}
