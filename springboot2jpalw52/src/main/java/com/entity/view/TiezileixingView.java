package com.entity.view;

import com.entity.TiezileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 帖子类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
@TableName("tiezileixing")
public class TiezileixingView  extends TiezileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiezileixingView(){
	}
 
 	public TiezileixingView(TiezileixingEntity tiezileixingEntity){
 	try {
			BeanUtils.copyProperties(this, tiezileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
