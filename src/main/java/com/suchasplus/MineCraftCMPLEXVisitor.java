package com.suchasplus;

import com.suchasplus.gen.minecraftCMPLEX.MineCraftBaseVisitor;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.AdInfoContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.CampaignInfoContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.CreativeInfoContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.DatasetTypeContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.DatasetValidContentContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.EntityIdContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ExcludeOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.IntersectOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.JunctionOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ProgContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ResultContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.UploadPkgContext;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 18:04
 */
public class MineCraftCMPLEXVisitor extends MineCraftBaseVisitor<Integer> {
	
//	@Override
//	public Integer visitResult(MineCraftParser.ResultContext ctx) {
//
//		return 0;
//	}
	
	
	@Override
	public Integer visitProg(ProgContext ctx) {
		System.out.println("prog " + ctx.getText());
		return super.visitProg(ctx);
	}
	
	@Override
	public Integer visitResult(ResultContext ctx) {
		System.out.println("result " + ctx.getText());
		return super.visitResult(ctx);
	}
	
	@Override
	public Integer visitIntersectOp(IntersectOpContext ctx) {
		System.out.println("inter " + ctx.getText());
		return super.visitIntersectOp(ctx);
	}
	
	@Override
	public Integer visitJunctionOp(JunctionOpContext ctx) {
		System.out.println(ctx.getText());
		return super.visitJunctionOp(ctx);
	}
	
	@Override
	public Integer visitExcludeOp(ExcludeOpContext ctx) {
		System.out.println(ctx.getText());
		return super.visitExcludeOp(ctx);
	}
	
	@Override
	public Integer visitEntityId(EntityIdContext ctx) {
		System.out.println("ctx.getText() = " + ctx.getText());
		return super.visitEntityId(ctx);
	}
	
	@Override
	public Integer visitUploadPkg(UploadPkgContext ctx) {
		System.out.println("upload " + ctx.getText());
		System.out.println(ctx.getChild(EntityIdContext.class, 0).getText());
		return super.visitUploadPkg(ctx);
	}
	
	@Override
	public Integer visitDatasetType(DatasetTypeContext ctx) {
		System.out.println("dataset " + ctx.getText());
		return super.visitDatasetType(ctx);
	}
	
	@Override
	public Integer visitDatasetLogical(MineCraftParser.DatasetLogicalContext ctx) {
		System.out.println(ctx.getText() + "adf");
		return 0;
	}
	
	@Override
	public Integer visitCampaignInfo(CampaignInfoContext ctx) {
		return super.visitCampaignInfo(ctx);
	}
	
	@Override
	public Integer visitAdInfo(AdInfoContext ctx) {
		return super.visitAdInfo(ctx);
	}
	
	@Override
	public Integer visitCreativeInfo(CreativeInfoContext ctx) {
		return super.visitCreativeInfo(ctx);
	}
	
	@Override
	public Integer visitDatasetValidContent(DatasetValidContentContext ctx) {
		return super.visitDatasetValidContent(ctx);
	}
}
