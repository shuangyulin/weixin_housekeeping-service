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

import com.entity.TiezixinxiEntity;
import com.entity.view.TiezixinxiView;

import com.service.TiezixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 帖子信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-08-19 15:22:26
 */
@RestController
@RequestMapping("/tiezixinxi")
public class TiezixinxiController {
    @Autowired
    private TiezixinxiService tiezixinxiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TiezixinxiEntity tiezixinxi,
		HttpServletRequest request){
        if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
            tiezixinxi.setUserid((Long)request.getSession().getAttribute("userId"));
        }
        EntityWrapper<TiezixinxiEntity> ew = new EntityWrapper<TiezixinxiEntity>();



		PageUtils page = tiezixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiezixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TiezixinxiEntity tiezixinxi, 
		HttpServletRequest request){
        EntityWrapper<TiezixinxiEntity> ew = new EntityWrapper<TiezixinxiEntity>();

		PageUtils page = tiezixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiezixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TiezixinxiEntity tiezixinxi){
       	EntityWrapper<TiezixinxiEntity> ew = new EntityWrapper<TiezixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tiezixinxi, "tiezixinxi")); 
        return R.ok().put("data", tiezixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TiezixinxiEntity tiezixinxi){
        EntityWrapper< TiezixinxiEntity> ew = new EntityWrapper< TiezixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tiezixinxi, "tiezixinxi")); 
		TiezixinxiView tiezixinxiView =  tiezixinxiService.selectView(ew);
		return R.ok("查询帖子信息成功").put("data", tiezixinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TiezixinxiEntity tiezixinxi = tiezixinxiService.selectById(id);
		tiezixinxi.setClicknum(tiezixinxi.getClicknum()+1);
		tiezixinxi.setClicktime(new Date());
		tiezixinxiService.updateById(tiezixinxi);
        tiezixinxi = tiezixinxiService.selectView(new EntityWrapper<TiezixinxiEntity>().eq("id", id));
        return R.ok().put("data", tiezixinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TiezixinxiEntity tiezixinxi = tiezixinxiService.selectById(id);
		tiezixinxi.setClicknum(tiezixinxi.getClicknum()+1);
		tiezixinxi.setClicktime(new Date());
		tiezixinxiService.updateById(tiezixinxi);
        tiezixinxi = tiezixinxiService.selectView(new EntityWrapper<TiezixinxiEntity>().eq("id", id));
        return R.ok().put("data", tiezixinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TiezixinxiEntity tiezixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tiezixinxi);
    	tiezixinxi.setUserid((Long)request.getSession().getAttribute("userId"));
        tiezixinxiService.insert(tiezixinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TiezixinxiEntity tiezixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tiezixinxi);
        tiezixinxiService.insert(tiezixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TiezixinxiEntity tiezixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tiezixinxi);
        tiezixinxiService.updateById(tiezixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tiezixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TiezixinxiEntity tiezixinxi, HttpServletRequest request,String pre){
        EntityWrapper<TiezixinxiEntity> ew = new EntityWrapper<TiezixinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = tiezixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiezixinxi), params), params));
        return R.ok().put("data", page);
    }











}
