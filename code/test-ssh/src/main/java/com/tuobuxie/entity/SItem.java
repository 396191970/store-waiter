package com.tuobuxie.entity;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;


public class SItem {


	List<TItem> tItem= new ArrayList<TItem>();


	public List<TItem> gettItem() {
		return tItem;
	}

	public void settItem(List<TItem> tItem) {
		this.tItem = tItem;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return JSON.toJSONString(this);
	}

}
