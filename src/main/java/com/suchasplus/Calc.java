package com.suchasplus;

import com.suchasplus.gen.labeledexpr.LabeledExprLexer;
import com.suchasplus.gen.labeledexpr.LabeledExprParser;
import com.suchasplus.gen.libexpr.LibExprLexer;
import com.suchasplus.gen.libexpr.LibExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 20:36
 */
public class Calc {
	
	public static void main(String[] args) throws IOException{
		String inputFile = null;
		if (args.length > 0) {
			inputFile = args[0];
		}
		InputStream is = System.in;
		if(inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		CharStream input = CharStreams.fromStream(is);
		LabeledExprLexer lexer = new LabeledExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledExprParser parser = new LabeledExprParser(tokens);
		ParseTree tree = parser.prog();
		
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
	}
}
