package com.suchasplus;

import com.suchasplus.agen.ArrayInitLexer;
import com.suchasplus.agen.ArrayInitParser;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 16:50
 *
 * Chapter 3.4
 */
public class Translate {
	
	public static void main(String[] args) throws IOException{
		//ANTLRInputStream input = new ANTLRInputStream(System.in);
		//ANTLRInputStream is deprecated in v4.7
		
		// create a CharStream that reads from standard input
		CharStream input = CharStreams.fromStream(System.in);
		// only accept {1,2,3} style
		
		
		// create a lexer that feeds off of input CharStream
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		ArrayInitParser parser = new ArrayInitParser(tokens);
		
		ParseTree tree = parser.init(); // begin parsing at init rule
		
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		// Walk the tree created during the parse, trigger callbacks
		walker.walk(new Short2UnicodeString(), tree);
		
		System.out.println(); // print a \n after translation
	}
}
