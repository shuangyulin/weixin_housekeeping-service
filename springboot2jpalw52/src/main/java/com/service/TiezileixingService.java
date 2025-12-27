package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiezileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiezileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiezileixingView;


/**
 * 帖子类型
 *
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface TiezileixingService extends IService<TiezileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiezileixingVO> selectListVO(Wrapper<TiezileixingEntity> wrapper);
   	
   	TiezileixingVO selectVO(@Param("ew") Wrapper<TiezileixingEntity> wrapper);
   	
   	List<TiezileixingView> selectListView(Wrapper<TiezileixingEntity> wrapper);
   	
   	TiezileixingView selectView(@Param("ew") Wrapper<TiezileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiezileixingEntity> wrapper);

   	

}

