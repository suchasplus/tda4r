package com.suchasplus;

import com.suchasplus.gen.java1dot7.JavaBaseListener;
import com.suchasplus.gen.java1dot7.JavaParser;
import org.antlr.v4.runtime.TokenStream;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 21:43
 */
public class ExtractInterfaceListener extends JavaBaseListener {
	private JavaParser parser;
	public ExtractInterfaceListener(JavaParser parser) {
		this.parser = parser;
	}
	
	@Override
	public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		System.out.println("interface I"+ctx.Identifier()+" {");
	}
	
	@Override
	public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		System.out.println("}");
	}
	
	@Override
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		String type = (ctx.typeType() == null) ? "void" : tokens.getText(ctx.typeType());
		String args = tokens.getText(ctx.formalParameters());
		System.out.println("\t"+ type + " " + ctx.Identifier() + " " + args + ";" );
		/*
		importorg.antlr.v4.runtime.Lexer;
		importorg.antlr.v4.runtime.CharStream;
		importorg.antlr.v4.runtime.Token;
		importorg.antlr.v4.runtime.TokenStream;
		importorg.antlr.v4.runtime.*;
		importorg.antlr.v4.runtime.atn.*;
		importorg.antlr.v4.runtime.dfa.DFA;
		importorg.antlr.v4.runtime.misc.*;
		interface IDemo {
		        String[] getTokenNames ();
		        Vocabulary getVocabulary ();
		        String getGrammarFileName ();
		        String[] getRuleNames ();
		        String getSerializedATN ();
		        String[] getChannelNames ();
		        String[] getModeNames ();
		        ATN getATN ();
		        Map<String,Integer> testFunction (Integera,List<List<String>>params);
		}
		 */
		
		// https://github.com/antlr/antlr4/blob/master/runtime/Java/src/org/antlr/v4/runtime/RuleContext.java#L122
		// without space
		/*
		@Override
		public String getText() {
			if (getChildCount() == 0) {
				return "";
			}
	
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < getChildCount(); i++) {
				builder.append(getChild(i).getText());
			}
	
			return builder.toString();
		}
		 */
	}
	
	@Override
	public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		String context = parser.getTokenStream().getText(ctx);
		System.out.println(context);
	}
}
