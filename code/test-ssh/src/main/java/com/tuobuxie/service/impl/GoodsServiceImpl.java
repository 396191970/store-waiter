package com.tuobuxie.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuobuxie.dao.GoodsDao;
import com.tuobuxie.entity.TGoods;
import com.tuobuxie.service.GoodsService;

/**
 * 创建时间：2016-1-22 下午1:03:47
 *
 * @author 李少峰
 * @version  描述：
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;


	@Override
	public TGoods load(Integer id) {
		return null;
	}

	@Override
	public TGoods get(Integer id) {
		return goodsDao.get(id);
	}

	@Override
	public List<TGoods> findAll() {
		return goodsDao.findAll();
	}

	@Override
	public void persist(TGoods entity) {
		goodsDao.persist(entity);
	}

	@Override
	public Integer save(TGoods entity) {
		return goodsDao.save(entity);
	}

	@Override
	public void saveOrUpdate(TGoods entity) {
		goodsDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		goodsDao.delete(id);
	}

	@Override
	public void flush() {
		goodsDao.flush();
	}


}