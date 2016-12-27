package com.tuobuxie.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tuobuxie.dao.ShoppingCartDao;
import com.tuobuxie.entity.TShoppingCart;
/**
 * 创建时间：2016-1-22 下午12:51:47
 *
 * @author 李少峰
 * @version
 * 描述： dao实现类
 */

@Repository("shoppingCartDao")
public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();

	}

	@Override
	public TShoppingCart load(Integer id) {
		return (TShoppingCart) this.getCurrentSession().load(TShoppingCart.class, id);
	}

	@Override
	public TShoppingCart get(Integer id) {
		return (TShoppingCart) this.getCurrentSession().get(TShoppingCart.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TShoppingCart> findAll() {
		List<TShoppingCart> TShoppingCartIds = this.getCurrentSession()
				.createQuery("from TShoppingCart").list();
		return TShoppingCartIds;
	}

	@Override
	public void persist(TShoppingCart entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(TShoppingCart entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(TShoppingCart entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		TShoppingCart entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}


}