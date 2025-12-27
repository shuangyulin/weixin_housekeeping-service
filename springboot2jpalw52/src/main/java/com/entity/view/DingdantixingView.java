package com.entity.view;

import com.entity.DingdantixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 订单提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
@TableName("dingdantixing")
public class DingdantixingView  extends DingdantixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdantixingView(){
	}
 
 	public DingdantixingView(DingdantixingEntity dingdantixingEntity){
 	try {
			BeanUtils.copyProperties(this, dingdantixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
