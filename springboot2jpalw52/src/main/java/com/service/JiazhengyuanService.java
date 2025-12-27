package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengyuanView;


/**
 * 家政员
 *
 * @author 
 * @email 
 * @date 2024-08-19 15:22:25
 */
public interface JiazhengyuanService extends IService<JiazhengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengyuanVO> selectListVO(Wrapper<JiazhengyuanEntity> wrapper);
   	
   	JiazhengyuanVO selectVO(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);
   	
   	List<JiazhengyuanView> selectListView(Wrapper<JiazhengyuanEntity> wrapper);
   	
   	JiazhengyuanView selectView(@Param("ew") Wrapper<JiazhengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengyuanEntity> wrapper);

   	

}

