package com.tuobuxie.service;


import java.io.Serializable;
import java.util.List;

/**
 * 创建时间：2015-2-11 下午2:26:42
 *
 * @author 李少峰
 * @version
 *
 * Dao通用接口
 */

interface GenericService<T, PK extends Serializable> {

	T load(PK id);

	T get(PK id);

	List<T> findAll();

	void persist(T entity);

	PK save(T entity);

	void saveOrUpdate(T entity);

	void delete(PK id);

	void flush();

}