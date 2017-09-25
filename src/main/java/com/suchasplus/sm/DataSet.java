package com.suchasplus.sm;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 19:12
 */
public class DataSet {
	
	private Integer jobId;
	
	private List<IEntity> children = new ArrayList<>();
	
	public DataSet() {
	}
	
	public Integer addChild(IEntity data) {
		children.add(data);
		return children.size();
	}
	
	public List<IEntity> getChildren() {
		return children;
	}
	
}
