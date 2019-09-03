package com.bozpower.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pojo {
	
	private Map<Integer, Requestlog> requestlogList = new HashMap<Integer, Requestlog>();//保存请求开锁日志到缓存中

	private static int indexNumber;//保存审核之前的未审核数量
	
	public Map<Integer, Requestlog> getRequestlogList() {
		return requestlogList;
	}

	public void setRequestlogList(Integer id, Requestlog saveRequestlog) {
		this.requestlogList.put(id, saveRequestlog);
	}
	
	
	public void removeMapByDid(List<Integer> id) {
		//删除已经审核的请求日志
		for(Integer i: id) {
			requestlogList.remove(i);
		}
		
	}
	
	public void removeMapById(int id) {
		requestlogList.remove(id);
	}
	
	
	public void setIndexNumber() {
		indexNumber = requestlogList.size();
	}
	
	public int getIndexNumber() {
		return indexNumber;
	}
	
	
	//
	public int size() {
		return requestlogList.size();
	}
	
	
	

}
