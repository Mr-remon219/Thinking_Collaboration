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


import com.dao.XiangmuwendangDao;
import com.entity.XiangmuwendangEntity;
import com.service.XiangmuwendangService;
import com.entity.vo.XiangmuwendangVO;
import com.entity.view.XiangmuwendangView;

@Service("xiangmuwendangService")
public class XiangmuwendangServiceImpl extends ServiceImpl<XiangmuwendangDao, XiangmuwendangEntity> implements XiangmuwendangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuwendangEntity> page = this.selectPage(
                new Query<XiangmuwendangEntity>(params).getPage(),
                new EntityWrapper<XiangmuwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuwendangEntity> wrapper) {
		  Page<XiangmuwendangView> page =new Query<XiangmuwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XiangmuwendangVO> selectListVO(Wrapper<XiangmuwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuwendangVO selectVO(Wrapper<XiangmuwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuwendangView> selectListView(Wrapper<XiangmuwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuwendangView selectView(Wrapper<XiangmuwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
