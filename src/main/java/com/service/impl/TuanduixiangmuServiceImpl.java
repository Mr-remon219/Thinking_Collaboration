package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuanduixiangmuDao;
import com.entity.TuanduixiangmuEntity;
import com.service.TuanduixiangmuService;
import com.entity.vo.TuanduixiangmuVO;
import com.entity.view.TuanduixiangmuView;

@Service("tuanduixiangmuService")
public class TuanduixiangmuServiceImpl extends ServiceImpl<TuanduixiangmuDao, TuanduixiangmuEntity> implements TuanduixiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuanduixiangmuEntity> page = this.selectPage(
                new Query<TuanduixiangmuEntity>(params).getPage(),
                new EntityWrapper<TuanduixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuanduixiangmuEntity> wrapper) {
		  Page<TuanduixiangmuView> page =new Query<TuanduixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TuanduixiangmuVO> selectListVO(Wrapper<TuanduixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuanduixiangmuVO selectVO(Wrapper<TuanduixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuanduixiangmuView> selectListView(Wrapper<TuanduixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuanduixiangmuView selectView(Wrapper<TuanduixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
