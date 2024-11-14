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

import com.entity.TuanduixiangmuEntity;
import com.entity.view.TuanduixiangmuView;

import com.service.TuanduixiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 团队项目
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-03 16:07:35
 */
@RestController
@RequestMapping("/tuanduixiangmu")
public class TuanduixiangmuController {
    @Autowired
    private TuanduixiangmuService tuanduixiangmuService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuanduixiangmuEntity tuanduixiangmu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fuzeren")) {
			tuanduixiangmu.setTuanduimingcheng((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuanduixiangmuEntity> ew = new EntityWrapper<TuanduixiangmuEntity>();

		PageUtils page = tuanduixiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuanduixiangmu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuanduixiangmuEntity tuanduixiangmu, 
		HttpServletRequest request){
        EntityWrapper<TuanduixiangmuEntity> ew = new EntityWrapper<TuanduixiangmuEntity>();

		PageUtils page = tuanduixiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuanduixiangmu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuanduixiangmuEntity tuanduixiangmu){
       	EntityWrapper<TuanduixiangmuEntity> ew = new EntityWrapper<TuanduixiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuanduixiangmu, "tuanduixiangmu")); 
        return R.ok().put("data", tuanduixiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuanduixiangmuEntity tuanduixiangmu){
        EntityWrapper< TuanduixiangmuEntity> ew = new EntityWrapper< TuanduixiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuanduixiangmu, "tuanduixiangmu")); 
		TuanduixiangmuView tuanduixiangmuView =  tuanduixiangmuService.selectView(ew);
		return R.ok("查询团队项目成功").put("data", tuanduixiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuanduixiangmuEntity tuanduixiangmu = tuanduixiangmuService.selectById(id);
        return R.ok().put("data", tuanduixiangmu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuanduixiangmuEntity tuanduixiangmu = tuanduixiangmuService.selectById(id);
        return R.ok().put("data", tuanduixiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuanduixiangmuEntity tuanduixiangmu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuanduixiangmu);
        tuanduixiangmuService.insert(tuanduixiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuanduixiangmuEntity tuanduixiangmu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuanduixiangmu);
        tuanduixiangmuService.insert(tuanduixiangmu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TuanduixiangmuEntity tuanduixiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuanduixiangmu);
        tuanduixiangmuService.updateById(tuanduixiangmu);//全部更新
        return R.ok();
    }

    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuanduixiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    

    @RequestMapping("/deleterenwu")
    public R deleterenwu(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String renwuname){
        tuanduixiangmu.deleterenwu(renwuname);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }

    @RequestMapping("/insertrenwu")
    public R insertrenwu(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String xin, String Type){
        tuanduixiangmu.insertRenwu(xin, Type);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }

    @RequestMapping("/updaterenwu")
    public R updaterenwu(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String xin, int dex){
        tuanduixiangmu.updaterenwu(xin, dex);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }


    @RequestMapping("/inserttype")
    public R inserttype(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String Type){
        tuanduixiangmu.inserttype(Type);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }

    @RequestMapping("/updatetype")
    public R updatetype(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String OldType, String NewType){
        tuanduixiangmu.updatetype(OldType, NewType);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }

    @RequestMapping("/deletetype")
    public R deletetype(@RequestBody TuanduixiangmuEntity tuanduixiangmu, String Type){
        tuanduixiangmu.deletetype(Type);
        tuanduixiangmuService.updateById(tuanduixiangmu);
        return R.ok();
    }
















}
