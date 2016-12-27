package com.tuobuxie.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tuobuxie.dao.*;
import com.tuobuxie.entity.TGoods;
/**
 * 创建时间：2016-1-22 下午12:51:47
 *
 * @author 李少峰
 * @version
 * 描述： dao实现类
 */

@Repository("goodsDao")
public class GoodsDaoImpl implements GoodsDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();

	}

	@Override
	public TGoods load(Integer id) {
		return (TGoods) this.getCurrentSession().load(TGoods.class, id);
	}

	@Override
	public TGoods get(Integer id) {
		return (TGoods) this.getCurrentSession().get(TGoods.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TGoods> findAll() {
		List<TGoods> TGoodsIds = this.getCurrentSession()
				.createQuery("from TGoods").list();
		return TGoodsIds;
	}

	@Override
	public void persist(TGoods entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(TGoods entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(TGoods entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		TGoods entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}


}