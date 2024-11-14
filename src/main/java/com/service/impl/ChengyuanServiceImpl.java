package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengyuanDao;
import com.entity.ChengyuanEntity;
import com.service.ChengyuanService;
import com.entity.vo.ChengyuanVO;
import com.entity.view.ChengyuanView;

@Service("chengyuanService")
public class ChengyuanServiceImpl extends ServiceImpl<ChengyuanDao, ChengyuanEntity> implements ChengyuanService {




	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengyuanEntity> page = this.selectPage(
                new Query<ChengyuanEntity>(params).getPage(),
                new EntityWrapper<ChengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengyuanEntity> wrapper) {
		  Page<ChengyuanView> page =new Query<ChengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChengyuanVO> selectListVO(Wrapper<ChengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengyuanVO selectVO(Wrapper<ChengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengyuanView> selectListView(Wrapper<ChengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengyuanView selectView(Wrapper<ChengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
