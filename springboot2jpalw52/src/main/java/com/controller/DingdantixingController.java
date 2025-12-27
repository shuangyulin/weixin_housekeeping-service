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

import com.entity.DingdantixingEntity;
import com.entity.view.DingdantixingView;

import com.service.DingdantixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 订单提醒
 * 后端接口
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
@RestController
@RequestMapping("/dingdantixing")
public class DingdantixingController {
    @Autowired
    private DingdantixingService dingdantixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DingdantixingEntity dingdantixing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			dingdantixing.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiazhengyuan")) {
			dingdantixing.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdantixingEntity> ew = new EntityWrapper<DingdantixingEntity>();



		PageUtils page = dingdantixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdantixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DingdantixingEntity dingdantixing, 
		HttpServletRequest request){
        EntityWrapper<DingdantixingEntity> ew = new EntityWrapper<DingdantixingEntity>();

		PageUtils page = dingdantixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdantixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DingdantixingEntity dingdantixing){
       	EntityWrapper<DingdantixingEntity> ew = new EntityWrapper<DingdantixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dingdantixing, "dingdantixing")); 
        return R.ok().put("data", dingdantixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DingdantixingEntity dingdantixing){
        EntityWrapper< DingdantixingEntity> ew = new EntityWrapper< DingdantixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dingdantixing, "dingdantixing")); 
		DingdantixingView dingdantixingView =  dingdantixingService.selectView(ew);
		return R.ok("查询订单提醒成功").put("data", dingdantixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DingdantixingEntity dingdantixing = dingdantixingService.selectById(id);
        return R.ok().put("data", dingdantixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DingdantixingEntity dingdantixing = dingdantixingService.selectById(id);
        return R.ok().put("data", dingdantixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DingdantixingEntity dingdantixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dingdantixing);
        dingdantixingService.insert(dingdantixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DingdantixingEntity dingdantixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dingdantixing);
        dingdantixingService.insert(dingdantixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DingdantixingEntity dingdantixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dingdantixing);
        dingdantixingService.updateById(dingdantixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dingdantixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	











}
