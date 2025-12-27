package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiezixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiezixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiezixinxiView;


/**
 * 帖子信息
 *
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
public interface TiezixinxiService extends IService<TiezixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiezixinxiVO> selectListVO(Wrapper<TiezixinxiEntity> wrapper);
   	
   	TiezixinxiVO selectVO(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);
   	
   	List<TiezixinxiView> selectListView(Wrapper<TiezixinxiEntity> wrapper);
   	
   	TiezixinxiView selectView(@Param("ew") Wrapper<TiezixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiezixinxiEntity> wrapper);

   	

}

