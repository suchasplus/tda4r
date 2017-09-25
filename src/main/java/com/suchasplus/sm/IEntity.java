package com.suchasplus.sm;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 20:59
 */
public interface IEntity {
	enum entityType {
		UPLOAD,
		CAMPAIGN,
		AD,
		CREATIVE
	}
	
	public entityType getType();
	
}
