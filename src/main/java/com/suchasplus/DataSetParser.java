package com.suchasplus;

import com.suchasplus.ett.MCListener;
import com.suchasplus.gen.minecraft.MineCraftLexer;
import com.suchasplus.gen.minecraft.MineCraftParser;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-11 17:05
 */
public class DataSetParser {
	
	public static void main(String[] args) throws IOException {
		InputStream is =
				ClassLoader.getSystemResourceAsStream("test.new.mc");
		CharStream input = CharStreams.fromStream(is);
		MineCraftParser parser = new MineCraftParser(new CommonTokenStream(new MineCraftLexer(input)));
		ParseTree tree = parser.exclude();
		System.out.println(tree.toStringTree(parser));
		ParseTreeWalker walker = new ParseTreeWalker();

		Long uid = 1641511391L;
		MCListener listener = new MCListener(uid);
		walker.walk(listener, tree);
		System.out.printf(listener.getDss().toString());
	}
}
