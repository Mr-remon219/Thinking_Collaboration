package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuwendangView;


/**
 * 项目文档
 *
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface XiangmuwendangService extends IService<XiangmuwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuwendangVO> selectListVO(Wrapper<XiangmuwendangEntity> wrapper);
   	
   	XiangmuwendangVO selectVO(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);
   	
   	List<XiangmuwendangView> selectListView(Wrapper<XiangmuwendangEntity> wrapper);
   	
   	XiangmuwendangView selectView(@Param("ew") Wrapper<XiangmuwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuwendangEntity> wrapper);

   	

}

