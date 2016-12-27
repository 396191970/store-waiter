package com.tuobuxie.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tuobuxie.dao.ItemDao;
import com.tuobuxie.entity.TItem;
import com.tuobuxie.entity.TItem;
/**
 * 创建时间：2016-1-22 下午12:51:47
 *
 * @author 李少峰
 * @version
 * 描述： dao实现类
 */
@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();

	}

	@Override
	public TItem load(Integer id) {
		return (TItem) this.getCurrentSession().load(TItem.class, id);
	}

	@Override
	public TItem get(Integer id) {
		return (TItem) this.getCurrentSession().get(TItem.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TItem> findAll() {
		List<TItem> TShoppingCartIds = this.getCurrentSession()
				.createQuery("from TItem").list();
		return TShoppingCartIds;
	}

	@Override
	public void persist(TItem entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(TItem entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(TItem entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		TItem entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}


}