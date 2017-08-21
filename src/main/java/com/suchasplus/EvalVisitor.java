package com.suchasplus;

import com.suchasplus.gen.labeledexpr.LabeledExprBaseVisitor;
import com.suchasplus.gen.labeledexpr.LabeledExprParser;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 20:42
 */
public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
	/** "memory" for our calculator; variable/value pairs go here */
	private Map<String, Integer> memory = new HashMap<>(100);
	
	/** ID '=' expr NEWLINE */
	@Override
	public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id, value);
		return value;
	}
	
	/** expr NEWLINE */
	@Override
	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
		Integer value = visit(ctx.expr()); // evaluate the expr child
		if(value != null) System.out.println(value); // print the result while not CLEAR return
		return 0; // return dummy value
	}
	
	/** INT */
	@Override
	public Integer visitInt(LabeledExprParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}
	
	/** ID */
	@Override
	public Integer visitId(LabeledExprParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if ( memory.containsKey(id) ) return memory.get(id);
		System.out.println("identifier " + id + " not initialized");
		return null;
	}
	
	/** expr op=('*'|'/') expr */
	@Override
	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
		int left = visit(ctx.expr(0)); // get value of left subexpression
		int right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == LabeledExprParser.MUL ) return left * right;
		return left / right; // must be DIV
	}
	/** expr op=('+'|'-') expr */
	@Override
	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
		int left = visit(ctx.expr(0)); // get value of left subexpression
		int right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == LabeledExprParser.ADD ) return left + right;
		return left - right; // must be SUB
	}
	/** '(' expr ')' */
	@Override
	public Integer visitParens(LabeledExprParser.ParensContext ctx) {
		return visit(ctx.expr()); // return child expr's value
	}
	
	@Override
	public Integer visitCLEAR(LabeledExprParser.CLEARContext ctx) {
		memory.clear();
		return null;
	}
	
}
