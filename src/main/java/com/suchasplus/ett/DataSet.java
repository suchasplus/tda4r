package com.suchasplus.ett;

import java.util.Date;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-11 17:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataSet {
	private DSType type;
	private int frequency = -1;
	private Set<BHVType> bhv;
	private Date startTime;
	private Date endTime;
	private List<Integer> ids;
	
	
	private Long uid;
}
