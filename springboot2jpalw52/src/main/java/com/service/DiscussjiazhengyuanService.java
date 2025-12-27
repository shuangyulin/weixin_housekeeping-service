package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiazhengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiazhengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiazhengyuanView;


/**
 * 家政员评论表
 *
 * @author 
 * @email 
 * @date 2024-08-19 15:22:27
 */
public interface DiscussjiazhengyuanService extends IService<DiscussjiazhengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiazhengyuanVO> selectListVO(Wrapper<DiscussjiazhengyuanEntity> wrapper);
   	
   	DiscussjiazhengyuanVO selectVO(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);
   	
   	List<DiscussjiazhengyuanView> selectListView(Wrapper<DiscussjiazhengyuanEntity> wrapper);
   	
   	DiscussjiazhengyuanView selectView(@Param("ew") Wrapper<DiscussjiazhengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiazhengyuanEntity> wrapper);

   	

}

