package com.suchasplus;

import com.suchasplus.gen.minecraftCMPLEX.MineCraftLexer;
import com.suchasplus.gen.minecraftCMPLEX.MineCraftParser;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-22 16:09
 */
public class MineCraftCMPLEXTester {
	
	public static void main(String[] args) throws IOException {
		InputStream is =
				ClassLoader.getSystemResourceAsStream("test.mc");
		CharStream input = CharStreams.fromStream(is);
//		MineCraftLexer lexer = new MineCraftLexer(input);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MineCraftParser parser = new MineCraftParser(new CommonTokenStream(new MineCraftLexer(input)));
		ParseTree tree = parser.prog();
		System.out.println(tree.toStringTree(parser));
		//MineCraftCMPLEXVisitor visitor = new MineCraftCMPLEXVisitor();
		//visitor.visit(tree);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		MineCraftCMPLEXListener extractor = new MineCraftCMPLEXListener(parser);
		walker.walk(extractor, tree);
	}
}
