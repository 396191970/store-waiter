package com.tuobuxie.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.tuobuxie.dao.ItemDao;
import com.tuobuxie.dao.ShoppingCartDao;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.entity.TShoppingCart;
import com.tuobuxie.service.ShoppingCartService;

/**
 * 创建时间：2016-1-22 下午1:03:47
 *
 * @author 李少峰
 * @version  描述：
 */
@Service("shoppingCartService")
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private ShoppingCartDao shoppingCartDao;

	@Autowired
	private ItemDao itemDao;

	@Override

	public void deleteItem(Integer sId ,Integer iId)
	{
		TShoppingCart tShoppingCart =shoppingCartDao.get(sId);
		TItem tItem =itemDao.get(iId);

		tShoppingCart.gettItems().remove(tItem);

		itemDao.delete(iId);
	}

	@Override
	public TShoppingCart load(Integer id) {
		return null;
	}

	@Override
	public TShoppingCart get(Integer id) {
		return shoppingCartDao.get(id);
	}

	@Override
	public List<TShoppingCart> findAll() {
		return shoppingCartDao.findAll();
	}

	@Override
	public void persist(TShoppingCart entity) {
		shoppingCartDao.persist(entity);
	}

	@Override
	public Integer save(TShoppingCart entity) {
		return shoppingCartDao.save(entity);
	}

	@Override
	public void saveOrUpdate(TShoppingCart entity) {
		shoppingCartDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		shoppingCartDao.delete(id);
	}

	@Override
	public void flush() {
		shoppingCartDao.flush();
	}


}