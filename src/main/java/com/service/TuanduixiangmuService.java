package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuanduixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuanduixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuanduixiangmuView;


/**
 * 团队项目
 *
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface TuanduixiangmuService extends IService<TuanduixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuanduixiangmuVO> selectListVO(Wrapper<TuanduixiangmuEntity> wrapper);
   	
   	TuanduixiangmuVO selectVO(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);
   	
   	List<TuanduixiangmuView> selectListView(Wrapper<TuanduixiangmuEntity> wrapper);
   	
   	TuanduixiangmuView selectView(@Param("ew") Wrapper<TuanduixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuanduixiangmuEntity> wrapper);

   	

}

