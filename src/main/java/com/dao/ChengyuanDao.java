package com.dao;

import com.entity.ChengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengyuanVO;
import com.entity.view.ChengyuanView;


/**
 * 成员
 * 
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface ChengyuanDao extends BaseMapper<ChengyuanEntity> {
	
	List<ChengyuanVO> selectListVO(@Param("ew") Wrapper<ChengyuanEntity> wrapper);
	
	ChengyuanVO selectVO(@Param("ew") Wrapper<ChengyuanEntity> wrapper);
	
	List<ChengyuanView> selectListView(@Param("ew") Wrapper<ChengyuanEntity> wrapper);

	List<ChengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ChengyuanEntity> wrapper);

	
	ChengyuanView selectView(@Param("ew") Wrapper<ChengyuanEntity> wrapper);
	

}
