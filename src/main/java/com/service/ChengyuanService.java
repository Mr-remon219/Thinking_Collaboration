package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyuanView;


/**
 * 成员
 *
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
public interface ChengyuanService extends IService<ChengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengyuanVO> selectListVO(Wrapper<ChengyuanEntity> wrapper);
   	
   	ChengyuanVO selectVO(@Param("ew") Wrapper<ChengyuanEntity> wrapper);
   	
   	List<ChengyuanView> selectListView(Wrapper<ChengyuanEntity> wrapper);
   	
   	ChengyuanView selectView(@Param("ew") Wrapper<ChengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengyuanEntity> wrapper);

   	

}

