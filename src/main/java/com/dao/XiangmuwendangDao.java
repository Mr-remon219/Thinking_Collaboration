package com.dao;

import com.entity.XiangmuwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuwendangVO;
import com.entity.view.XiangmuwendangView;


/**
 * 项目文档
 * 
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface XiangmuwendangDao extends BaseMapper<XiangmuwendangEntity> {
	
	List<XiangmuwendangVO> selectListVO(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);
	
	XiangmuwendangVO selectVO(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);
	
	List<XiangmuwendangView> selectListView(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);

	List<XiangmuwendangView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);

	
	XiangmuwendangView selectView(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);
	

}
