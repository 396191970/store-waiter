package com.tuobuxie.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.tuobuxie.entity.TGoods;
import com.tuobuxie.service.GoodsService;
/**
 *
 *
 * @author lishaofeng@szslcpay.com
 *
 */
@Controller

public class MangeController extends BaseController
{

	@Autowired
	GoodsService goodsService;

	//增加单项
	@RequestMapping(value="/mng/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response,
			HttpSession httpSession,TGoods tGoods,@RequestParam(value="file",required=false )MultipartFile file)
					throws Exception
	{
		System.out.println("into /mng/add");

		String filePath="";
		String filePathR="";
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				filePathR =  "/upload/"+ file.getOriginalFilename();
				filePath = request.getSession().getServletContext().getRealPath("/") +filePathR;
				// 转存文件
				file.transferTo(new File(filePath));

				tGoods.setCPicturePath(filePathR);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		tGoods.setCCreatDate(new Date());

		System.out.println(tGoods.toString());

		if(goodsService.save(tGoods)>0)
		{
			System.out.println("添加成功。");
		}
		else
			System.out.println("添加失败。");

		httpSession.setAttribute("tGoods", tGoods);
		response.sendRedirect("/jsp/reviewGoods.jsp");
		return null;
	}



	//删除一项
	@RequestMapping(value="/mng/del")
	public void deloodsById(Integer id,HttpServletResponse response)
	{
		System.out.println("into /mng/del");
		goodsService.delete(id);
		try {
			response.sendRedirect("/user/all");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//查看全部
	@RequestMapping(value = "/mng/all")
	public String all( Map<String,Object> map)
	{
		System.out.println("all");

		List<TGoods> tGoodsList =goodsService.findAll();
		System.out.println("查到菜单 数量："+tGoodsList.size());

		String str = JSON.toJSONString(tGoodsList);
		System.out.println("查到菜单 ："+str);

		map.put("size", tGoodsList.size());
		map.put("tGoodsList", tGoodsList);
		return  "mng/all";
	}

	//查看单项详情
	@RequestMapping(value="/mng/findOne")
	public void findById(Integer id,HttpSession httpSession,HttpServletResponse response)
	{
		System.out.println("into /mng/del");
		TGoods tGoods =goodsService.get(id);
		try {
			httpSession.setAttribute("tGoods", tGoods);
			response.sendRedirect("/jsp/reviewGoods.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//修改
	@RequestMapping(value="/mng/update")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response,
			HttpSession httpSession,TGoods tGoods,@RequestParam(value="file",required=false )MultipartFile file)
					throws Exception
	{
		System.out.println("into /mng/update");

		String filePath="";
		String filePathR="";
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				filePathR =  "/upload/"+ file.getOriginalFilename();
				filePath = request.getSession().getServletContext().getRealPath("/") +filePathR;
				// 转存文件
				file.transferTo(new File(filePath));

				tGoods.setCPicturePath(filePathR);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		tGoods.setCCreatDate(new Date());

		System.out.println(tGoods.toString());

		goodsService.saveOrUpdate(tGoods);

		System.out.println("添加成功。");

		httpSession.setAttribute("tGoods", tGoods);
		response.sendRedirect("/jsp/reviewGoods.jsp");
		return null;
	}


}
