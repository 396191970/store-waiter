package com.tuobuxie.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.tuobuxie.entity.SItem;
import com.tuobuxie.entity.TGoods;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.entity.TShoppingCart;
import com.tuobuxie.service.GoodsService;
import com.tuobuxie.service.ItemService;
import com.tuobuxie.service.ShoppingCartService;
/**
 *
 *
 * @author lishaofeng@szslcpay.com
 *
 */
@Controller
public class UserController extends BaseController
{

	@Autowired
	GoodsService goodsService;

	@Autowired
	ShoppingCartService shoppingCartService;

	@Autowired
	ItemService itemService;


	// test
	@RequestMapping(value = "/user/testJson")
	@ResponseBody
	public String testJson(@RequestBody String info ,HttpServletRequest request) throws IOException, NoSuchAlgorithmException
	{
		Map<String, String> map = new HashMap<String, String>();

		String userAgent = request.getHeader("User-Agent");
		System.out.println("\nUser-Agent:" + userAgent + "\nHost:" + request.getHeader("Host") + "\nMethod:"
				+ request.getMethod());

		System.out.println("RequestBody=" + info);
		return info;

	}
	//增加多项
	@RequestMapping(value = "/user/add")
	public String add(Map<String,Object> map, SItem lists ,Integer id)
	{
		System.out.println("add id="+id);
		if(lists.gettItem().size()==1)
		{
			return ERROR;
		}
		TShoppingCart tShoppingCart =null;
		if(null !=id)
		{
			tShoppingCart = new TShoppingCart();
		}
		else
		{
			tShoppingCart  =shoppingCartService.get(id);
		}
		List<TItem> list = lists.gettItem();
		for (TItem tItem : list) {
			System.out.println(tItem.toString());
			TGoods tgoods =goodsService.get(tItem.gettGoods().getCId());
			tItem.settGoods(tgoods);
			tShoppingCart.addShoppingItem(tItem);
		}
		System.out.println(tShoppingCart.toString());

		if(shoppingCartService.save(tShoppingCart)<0)
		{
			System.out.println("添加失败。");

			return ERROR;

		}

		System.out.println("添加成功。");
		map.put("tShoppingCart", tShoppingCart);
		return  "user/ordered";

	}


	//删除
	@RequestMapping(value = "/user/del")
	public String del(Map<String,Object> map, Integer sId,Integer iId,HttpServletResponse response)
	{
		System.out.println("del sId="+sId +"\t iId"+iId);


		shoppingCartService.deleteItem(sId, iId);

		System.out.println("成功。");

		try {
			response.sendRedirect("/user//user/allOrdered?id="+sId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  SUCESS;
	}

	//根据订单号查看已点
	@RequestMapping(value = "/user/allOrdered")
	public String allOrdered(Map<String,Object> map, Integer id)
	{
		System.out.println("allOrdered id="+id);


		TShoppingCart tShoppingCart = shoppingCartService.get(id);
		if(null == tShoppingCart)
		{
			System.out.println("失败。");
			return ERROR;
		}

		System.out.println("成功。");

		System.out.println(tShoppingCart.toString());

		map.put("tShoppingCart", tShoppingCart);
		return  "user/ordered";
	}

	//查看全部
	@RequestMapping(value = "/user/all")
	public String all( Map<String,Object> map)
	{
		System.out.println("all");

		List<TGoods> tGoodsList =goodsService.findAll();
		System.out.println("查到菜单 数量："+tGoodsList.size());

		String str = JSON.toJSONString(tGoodsList);
		System.out.println("查到菜单 ："+str);

		map.put("size", tGoodsList.size());
		map.put("tGoodsList", tGoodsList);
		return  "user/all";
	}


	//查看全部
	@RequestMapping(value = "/user/orderAdd")
	public String orderAdd( Map<String,Object> map , Integer id)
	{
		System.out.println("orderAdd id="+id);

		List<TGoods> tGoodsList =goodsService.findAll();
		System.out.println("查到菜单 数量："+tGoodsList.size());

		String str = JSON.toJSONString(tGoodsList);
		System.out.println("查到菜单 ："+str);

		map.put("size", tGoodsList.size());
		map.put("id", id);
		map.put("tGoodsList", tGoodsList);
		return  "user/orderAdd";
	}
	//查看已点


	//修改已点
	@RequestMapping(value = "/user/update")
	public String update(Map<String,Object> map, SItem lists)
	{
		System.out.println("update");
		if(lists.gettItem().size()==1)
		{
			return ERROR;
		}
		TShoppingCart tShoppingCart = new TShoppingCart();
		List<TItem> list = lists.gettItem();
		for (TItem tItem : list) {
			System.out.println(tItem.toString());
			TGoods tgoods =goodsService.get(tItem.gettGoods().getCId());
			tItem.settGoods(tgoods);
			tShoppingCart.addShoppingItem(tItem);
		}
		System.out.println(tShoppingCart.toString());

		shoppingCartService.saveOrUpdate(tShoppingCart);

		System.out.println("添加成功。");
		map.put("tShoppingCart", tShoppingCart);
		return  "user/ordered";
	}

}
