package com.suchasplus.sm;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 21:01
 */
public class Upload implements IEntity {
	
	@Override
	public entityType getType() {
		return entityType.UPLOAD;
	}
}
