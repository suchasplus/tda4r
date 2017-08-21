package com.suchasplus;

import com.suchasplus.gen.java1dot7.JavaLexer;
import com.suchasplus.gen.java1dot7.JavaParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 21:41
 */
public class ExtractInterfaceTool {
	
	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if (args.length > 0) {inputFile = args[0];}
		InputStream is = System.in;
		if(inputFile != null) {is = new FileInputStream(inputFile);}
		CharStream input = CharStreams.fromStream(is);
		JavaLexer lexer = new JavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JavaParser parser = new JavaParser(tokens);
		ParseTree tree = parser.compilationUnit();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
		walker.walk(extractor, tree);
	}
}
