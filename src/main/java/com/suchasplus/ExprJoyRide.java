package com.suchasplus;

import com.suchasplus.gen.expr.ExprLexer;
import com.suchasplus.gen.expr.ExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 19:08
 */
public class ExprJoyRide {
	
	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if (args.length > 0) {
			inputFile = args[0];
		}
		InputStream is = System.in;
		if(inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		CharStream input = CharStreams.fromStream(is);
		ExprLexer lexer = new ExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		ParseTree tree = parser.prog();
		System.out.println(tree.toStringTree(parser));
		/*
		193
		a = 5
		b = 6
		a+b*2
		(1+2)*3
		 */
	}
}
