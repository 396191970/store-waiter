package com.tuobuxie.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuobuxie.dao.ItemDao;
import com.tuobuxie.dao.ShoppingCartDao;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.service.ItemService;

/**
 * 创建时间：2016-1-22 下午1:03:47
 *
 * @author 李少峰
 * @version  描述：
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;

	@Override
	public TItem load(Integer id) {
		return null;
	}

	@Override
	public TItem get(Integer id) {
		return itemDao.get(id);
	}

	@Override
	public List<TItem> findAll() {
		return itemDao.findAll();
	}

	@Override
	public void persist(TItem entity) {
		itemDao.persist(entity);
	}

	@Override
	public Integer save(TItem entity) {
		return itemDao.save(entity);
	}

	@Override
	public void saveOrUpdate(TItem entity) {
		itemDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		itemDao.delete(id);
	}

	@Override
	public void flush() {
		itemDao.flush();
	}


}