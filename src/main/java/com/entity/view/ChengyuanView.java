package com.entity.view;

import com.entity.ChengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 成员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
@TableName("chengyuan")
public class ChengyuanView  extends ChengyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengyuanView(){
	}
 
 	public ChengyuanView(ChengyuanEntity chengyuanEntity){
 	try {
			BeanUtils.copyProperties(this, chengyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
