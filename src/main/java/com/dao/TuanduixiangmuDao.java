package com.dao;

import com.entity.TuanduixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuanduixiangmuVO;
import com.entity.view.TuanduixiangmuView;


/**
 * 团队项目
 * 
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface TuanduixiangmuDao extends BaseMapper<TuanduixiangmuEntity> {
	
	List<TuanduixiangmuVO> selectListVO(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);
	
	TuanduixiangmuVO selectVO(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);
	
	List<TuanduixiangmuView> selectListView(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);

	List<TuanduixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);

	
	TuanduixiangmuView selectView(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);
	

}
