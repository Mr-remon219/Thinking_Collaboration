package com.entity.view;

import com.entity.TuanduixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 团队项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
@TableName("tuanduixiangmu")
public class TuanduixiangmuView  extends TuanduixiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuanduixiangmuView(){
	}
 
 	public TuanduixiangmuView(TuanduixiangmuEntity tuanduixiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, tuanduixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}