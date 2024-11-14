package com.entity.model;

import com.entity.TuanduixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 团队项目
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public class TuanduixiangmuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 项目阶段
	 */
	
	private String xiangmujieduan;
		
	/**
	 * 团队名称
	 */
	
	private String tuanduimingcheng;
		
	/**
	 * 团长姓名
	 */
	
	private String tuanzhangxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 项目需求
	 */
	
	private String xiangmuxuqiu;
				
	/**
	 * 设置：项目分类
	 */
	 
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
				
	
	/**
	 * 设置：项目阶段
	 */
	 
	public void setXiangmujieduan(String xiangmujieduan) {
		this.xiangmujieduan = xiangmujieduan;
	}
	
	/**
	 * 获取：项目阶段
	 */
	public String getXiangmujieduan() {
		return xiangmujieduan;
	}
				
	
	/**
	 * 设置：团队名称
	 */
	 
	public void setTuanduimingcheng(String tuanduimingcheng) {
		this.tuanduimingcheng = tuanduimingcheng;
	}
	
	/**
	 * 获取：团队名称
	 */
	public String getTuanduimingcheng() {
		return tuanduimingcheng;
	}
				
	
	/**
	 * 设置：团长姓名
	 */
	 
	public void setTuanzhangxingming(String tuanzhangxingming) {
		this.tuanzhangxingming = tuanzhangxingming;
	}
	
	/**
	 * 获取：团长姓名
	 */
	public String getTuanzhangxingming() {
		return tuanzhangxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：项目需求
	 */
	 
	public void setXiangmuxuqiu(String xiangmuxuqiu) {
		this.xiangmuxuqiu = xiangmuxuqiu;
	}
	
	/**
	 * 获取：项目需求
	 */
	public String getXiangmuxuqiu() {
		return xiangmuxuqiu;
	}
			
}
