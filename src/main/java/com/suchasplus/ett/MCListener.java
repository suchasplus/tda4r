package com.suchasplus.ett;

import com.suchasplus.gen.minecraft.MineCraftBaseListener;
import com.suchasplus.gen.minecraft.MineCraftParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-11 17:48
 */
public class MCListener extends MineCraftBaseListener {
	private DataSet currentDataSet = null;
	private List<DataSet> dss = new ArrayList<>();
	private Long uid;
	
	
	public MCListener(Long uid) {
		this.uid = uid;
	}
	
	public List<DataSet> getDss() {
		return dss;
	}
	
	@Override public void enterExclude(MineCraftParser.ExcludeContext ctx) {

	}
	
	@Override public void exitExclude(MineCraftParser.ExcludeContext ctx) {
	
	}
	
	@Override public void enterDataset(MineCraftParser.DatasetContext ctx) {
		currentDataSet = new DataSet();
		currentDataSet.setUid(uid);
		currentDataSet.setType(DSType.valueOf(ctx.pkgtype().getText().toUpperCase()));
	}
	@Override public void exitDataset(MineCraftParser.DatasetContext ctx) {
		dss.add(currentDataSet);
		currentDataSet = new DataSet();
	}
	
	@Override public void enterPkg(MineCraftParser.PkgContext ctx) {
		
//		for(int idx = 0; idx < ctx.pkgids().getChildCount(); idx++) {
//			System.out.println(ctx.pkgids().getChild(idx).getText());
//		}
		
		List<Integer> items = Stream.of(ctx.pkgids().getText().split(","))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
//		System.out.println(items);
		currentDataSet.setIds(items);
	}
	
	@Override public void exitFrequency(MineCraftParser.FrequencyContext ctx) {
//		System.out.println("" + (ctx.op.getType() == MineCraftParser.INT));
		currentDataSet.setFrequency(Integer.valueOf(ctx.getChild(2).getText()));
	}
	
	@Override public void exitUserbhv(MineCraftParser.UserbhvContext ctx) {
		System.out.println(ctx.entity_ubhv());
		Set<BHVType> bhvs = new HashSet<>(10);
		ctx.entity_ubhv().forEach((type) -> {
			bhvs.add(BHVType.valueOf(type.getText().toUpperCase()));
		});
		currentDataSet.setBhv(bhvs);
	}
	
	@Override public void exitTimespan(MineCraftParser.TimespanContext ctx) {
		System.out.println(ctx.getChild(2).getText() + " " + ctx.getChild(4).getText());
		currentDataSet.setStartTime(new java.util.Date(Long.parseLong(ctx.getChild(2).getText())*1000));
		currentDataSet.setEndTime(new java.util.Date(Long.parseLong(ctx.getChild(4).getText())*1000));
	}
}
