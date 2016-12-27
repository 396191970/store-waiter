package com.tuobuxie.service;


import com.tuobuxie.entity.TShoppingCart;


/**
 * 创建时间：2016-1-22 下午1:00:51
 * @author 李少峰
 * @version
 * 描述：
 */

public interface ShoppingCartService extends GenericService<TShoppingCart, Integer>{

	void deleteItem(Integer sId, Integer iId);

}