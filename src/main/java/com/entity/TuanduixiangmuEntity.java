package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 团队项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
@TableName("tuanduixiangmu")
public class TuanduixiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuanduixiangmuEntity() {
		
	}
	
	public TuanduixiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
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


	private String[] renwu = new String[50];

	int type = 0;

	private String[] TypeName = new String[50];



	private int idx = 0;

	private int renwushuliang;

	private int wanchengdu = 0;

	private int[] sign = new int[50];

	private int yiwancheng = 0;

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
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

	public String[] getRenwu() {
		return renwu;
	}

	public void setRenwu(String[] renwu) {
		this.renwu = renwu;
	}

	public int getRenwushuliang() {
		return renwushuliang;
	}

	public void setRenwushuliang(int renwushuliang) {
		this.renwushuliang = renwushuliang;
		this.idx = renwushuliang - 1;
	}


	public String getWanchengdu() {
		String swan = wanchengdu * 100 + "%";
		return swan;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String[] getTypeName() {
		return TypeName;
	}

	public void setTypeName(String[] typeName) {
		TypeName = typeName;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getYiwancheng() {
		return yiwancheng;
	}

	public void setYiwancheng(int yiwancheng) {
		this.yiwancheng = yiwancheng;
	}

	public void inserttype(String Type)
	{
		this.TypeName[this.idx] = Type;
		this.type += 1;
	}

	public void updatetype(String Oldtype, String Newtype){
		for (int i = 0; i < this.TypeName.length; i++)
			if (this.TypeName[i] == Oldtype)
				this.TypeName[i] = Newtype;
	}

	public void deleterenwu(String renwuname)
	{
		for (int i = 0; i < this.renwu.length; i++)
		{
			if (this.renwu[i].equals(renwuname))
			{
				this.renwu[i] = null;
				this.setWanchengdu(i);
				this.sign[i] = -1;
			}
		}
	}

	public void deletetype(String Type)
	{
		int t = 0;
		for (int i = 0; i < this.TypeName.length; i++)
		{
			if (this.TypeName[i] == Type)
				t = i;
		}
		for (int i = 0; i < this.renwu.length; i++)
		{
			if (this.sign[i] == t)
			{
				this.sign[i] = -1;
				this.renwu[i] = null;
			}
		}
		this.TypeName[t] = null;
	}

		public void updateWanchengdu(){
		this.wanchengdu = yiwancheng / renwushuliang;
	}

	public void insertRenwu(String xin, String Type)
	{
		int t = 0;
		for (int i = 0; i < TypeName.length; i++)
			if (TypeName[i] == Type)
				t = i;

		this.renwu[this.idx] = xin;
		this.sign[this.idx] = t;
		this.idx = this.idx + 1;
		this.renwushuliang += 1;
		this.updateWanchengdu();
	}

	public void updaterenwu(String xin, int dex)
	{
		this.renwu[dex] = xin;
	}

		public void setWanchengdu(int dex) {
		this.yiwancheng += 1;
		this.wanchengdu = yiwancheng / renwushuliang;
		this.renwu[dex] = null;
	}
}
