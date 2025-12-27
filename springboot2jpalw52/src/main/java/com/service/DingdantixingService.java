package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdantixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdantixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdantixingView;


/**
 * 订单提醒
 *
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface DingdantixingService extends IService<DingdantixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdantixingVO> selectListVO(Wrapper<DingdantixingEntity> wrapper);
   	
   	DingdantixingVO selectVO(@Param("ew") Wrapper<DingdantixingEntity> wrapper);
   	
   	List<DingdantixingView> selectListView(Wrapper<DingdantixingEntity> wrapper);
   	
   	DingdantixingView selectView(@Param("ew") Wrapper<DingdantixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdantixingEntity> wrapper);

   	

}

