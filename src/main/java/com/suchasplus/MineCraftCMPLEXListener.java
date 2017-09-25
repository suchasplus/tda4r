package com.suchasplus;

import com.suchasplus.gen.minecraftCMPLEX.MineCraftBaseListener;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.DatasetLogicalContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.DatasetTypeContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ExcludeOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.IntersectOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.JunctionOpContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ProgContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.ResultContext;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser.UploadPkgContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 16:16
 */
public class MineCraftCMPLEXListener extends MineCraftBaseListener {
	private MineCraftParser parser;
	
	public MineCraftCMPLEXListener(MineCraftParser parser) {
		this.parser = parser;
	}
	
	@Override
	public void enterProg(ProgContext ctx) {
		System.out.println(ctx.getText());
		super.enterProg(ctx);
	}
	
	@Override
	public void exitProg(ProgContext ctx) {
		super.exitProg(ctx);
	}
	
	@Override
	public void enterResult(ResultContext ctx) {
		super.enterResult(ctx);
	}
	
	@Override
	public void exitResult(ResultContext ctx) {
		super.exitResult(ctx);
	}
	
	@Override
	public void enterDatasetLogical(DatasetLogicalContext ctx) {
		super.enterDatasetLogical(ctx);
	}
	
	@Override
	public void exitDatasetLogical(DatasetLogicalContext ctx) {
		super.exitDatasetLogical(ctx);
	}
	
	@Override
	public void enterIntersectOp(IntersectOpContext ctx) {
		super.enterIntersectOp(ctx);
	}
	
	@Override
	public void exitIntersectOp(IntersectOpContext ctx) {
		super.exitIntersectOp(ctx);
	}
	
	@Override
	public void enterJunctionOp(JunctionOpContext ctx) {
		super.enterJunctionOp(ctx);
	}
	
	@Override
	public void exitJunctionOp(JunctionOpContext ctx) {
		super.exitJunctionOp(ctx);
	}
	
	@Override
	public void enterExcludeOp(ExcludeOpContext ctx) {
		super.enterExcludeOp(ctx);
	}
	
	@Override
	public void exitExcludeOp(ExcludeOpContext ctx) {
		super.exitExcludeOp(ctx);
	}
	
	@Override
	public void enterUploadPkg(UploadPkgContext ctx) {
		super.enterUploadPkg(ctx);
	}
	
	@Override
	public void exitUploadPkg(UploadPkgContext ctx) {
		super.exitUploadPkg(ctx);
	}
	
	@Override
	public void enterDatasetType(DatasetTypeContext ctx) {
		super.enterDatasetType(ctx);
	}
	
	@Override
	public void exitDatasetType(DatasetTypeContext ctx) {
		super.exitDatasetType(ctx);
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		super.enterEveryRule(ctx);
	}
	
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		super.exitEveryRule(ctx);
	}
	
	@Override
	public void visitTerminal(TerminalNode node) {
		super.visitTerminal(node);
	}
	
	@Override
	public void visitErrorNode(ErrorNode node) {
		super.visitErrorNode(node);
	}
}
