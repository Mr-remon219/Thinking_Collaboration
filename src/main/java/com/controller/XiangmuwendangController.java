package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiangmuwendangEntity;
import com.entity.view.XiangmuwendangView;

import com.service.XiangmuwendangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 项目文档
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
@RestController
@RequestMapping("/xiangmuwendang")
public class XiangmuwendangController {
    @Autowired
    private XiangmuwendangService xiangmuwendangService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmuwendangEntity xiangmuwendang,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangchuanshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangchuanshijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fuzeren")) {
			xiangmuwendang.setTuanduimingcheng((String)request.getSession().getAttribute("username"));
		}
		else {
            if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
                xiangmuwendang.setUserid((Long)request.getSession().getAttribute("userId"));
            }
        }
        EntityWrapper<XiangmuwendangEntity> ew = new EntityWrapper<XiangmuwendangEntity>();
                if(shangchuanshijianstart!=null) ew.ge("shangchuanshijian", shangchuanshijianstart);
                if(shangchuanshijianend!=null) ew.le("shangchuanshijian", shangchuanshijianend);

		PageUtils page = xiangmuwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuwendang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmuwendangEntity xiangmuwendang, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangchuanshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangchuanshijianend,
		HttpServletRequest request){
        EntityWrapper<XiangmuwendangEntity> ew = new EntityWrapper<XiangmuwendangEntity>();
                if(shangchuanshijianstart!=null) ew.ge("shangchuanshijian", shangchuanshijianstart);
                if(shangchuanshijianend!=null) ew.le("shangchuanshijian", shangchuanshijianend);

		PageUtils page = xiangmuwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuwendang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmuwendangEntity xiangmuwendang){
       	EntityWrapper<XiangmuwendangEntity> ew = new EntityWrapper<XiangmuwendangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmuwendang, "xiangmuwendang")); 
        return R.ok().put("data", xiangmuwendangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmuwendangEntity xiangmuwendang){
        EntityWrapper< XiangmuwendangEntity> ew = new EntityWrapper< XiangmuwendangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmuwendang, "xiangmuwendang")); 
		XiangmuwendangView xiangmuwendangView =  xiangmuwendangService.selectView(ew);
		return R.ok("查询项目文档成功").put("data", xiangmuwendangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmuwendangEntity xiangmuwendang = xiangmuwendangService.selectById(id);
        return R.ok().put("data", xiangmuwendang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmuwendangEntity xiangmuwendang = xiangmuwendangService.selectById(id);
        return R.ok().put("data", xiangmuwendang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmuwendangEntity xiangmuwendang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xiangmuwendang);
    	xiangmuwendang.setUserid((Long)request.getSession().getAttribute("userId"));
        xiangmuwendangService.insert(xiangmuwendang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmuwendangEntity xiangmuwendang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xiangmuwendang);
        xiangmuwendangService.insert(xiangmuwendang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiangmuwendangEntity xiangmuwendang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmuwendang);
        xiangmuwendangService.updateById(xiangmuwendang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmuwendangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
