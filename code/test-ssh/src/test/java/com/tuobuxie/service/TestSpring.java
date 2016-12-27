package com.tuobuxie.service;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.tuobuxie.entity.TGoods;
import com.tuobuxie.entity.TGoodsDetail;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.entity.TShoppingCart;


public class TestSpring {

	public static void main(String arg[])
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml","spring-hibernate.xml");
		System.out.println("new factory");


		ShoppingCartService shoppingCartService = (ShoppingCartService)factory.getBean("shoppingCartService");
//		GoodsService goodsService = (GoodsService)factory.getBean("goodsService");
//
//		List<TGoods> tGoods =  goodsService.findAll();
//
//		System.out.println("count :"+tGoods.size());
//		for (TGoods tGoods2 : tGoods) {
//
//			System.out.println(tGoods2.toString());
//
//		}
//
//		TShoppingCart tShoppingCart = new TShoppingCart();
//		for (TGoods tGoods2 : tGoods) {
//			TItem tItem = new TItem();
//			tItem.settGoods(tGoods2);
//			tShoppingCart.addShoppingItem(tItem);
//		}
//
//
//		shoppingCartService.save(tShoppingCart);

		 String str = JSON.toJSONString(shoppingCartService.findAll().toString());

			System.out.println(str);

	//	addGoods(factory);
		//getGoods(factory);
		//addShopping(factory);
		//getShopping(factory);

	}
	static void getShopping(ApplicationContext factory)
	{
		System.out.println("getShopping");

		ShoppingCartService shoppingCartService = (ShoppingCartService)factory.getBean("shoppingCartService");

		TShoppingCart tShoppingCart =  shoppingCartService.get(1);
		System.out.println(tShoppingCart.toString());


	}
	static void getGoods(ApplicationContext factory)
	{
		System.out.println("getShopping");

		GoodsService shoppingCartService = (GoodsService)factory.getBean("goodsService");

		TGoods tShoppingCart =  shoppingCartService.get(0);
		System.out.println(tShoppingCart.toString());

	}
	static void addShopping(ApplicationContext factory)
	{
		System.out.println("addShopping");


		ShoppingCartService shoppingCartService = (ShoppingCartService)factory.getBean("shoppingCartService");

		GoodsService goodsService = (GoodsService)factory.getBean("goodsService");

	//	shoppingCartService.delete(1);
		TShoppingCart tShoppingCart = new TShoppingCart();
		tShoppingCart.setCId(1);
//
//		tShoppingCart.addShoppingItem(goodsService.get(0));
//		tShoppingCart.addShoppingItem(goodsService.get(1));
//

		int id = shoppingCartService.save(tShoppingCart);
		System.out.println("return = "+id);


	}
	static void addGoods(ApplicationContext factory)
	{

		System.out.println("addGoods");

		GoodsService goodsService = (GoodsService)factory.getBean("goodsService");


		for(Integer cId =0; cId<2;cId++)
		{
			//integer cId=5;

			TGoodsDetail tGoodsDetailId = new TGoodsDetail();
			tGoodsDetailId.setCId(cId);
			tGoodsDetailId.setCDescribe("this is describe "+cId) ;
			tGoodsDetailId.setCFlavor("1" +cId);

			TGoods tGoods = new TGoods();
			tGoods.setCName("name "+cId);
			tGoods.setCId(cId);
			tGoods.setcTGoodsDetailId(tGoodsDetailId);
			tGoods.setCCreatDate(new Date());
			tGoods.setCPicturePath("CPicturePath "+cId);

			System.out.println(tGoods.toString());
			Integer id = goodsService.save(tGoods);
			System.out.println("return = "+id);
		}


	}
	static void saveGoods(ApplicationContext factory)
	{


		GoodsService goodsService = (GoodsService)factory.getBean("goodsService");

		System.out.println("222222");

		Integer cId=5;

		goodsService.delete(cId);

	}

}
