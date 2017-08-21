package com.suchasplus;

import com.suchasplus.agen.ArrayInitLexer;
import com.suchasplus.agen.ArrayInitParser;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) throws IOException {
	    // create a CharStream that reads from standard input
	    CharStream input = CharStreams.fromStream(System.in);
	    
	    //ANTLRInputStream input = new ANTLRInputStream(System.in);
	    //ANTLRInputStream is deprecated in v4.7
	    
	    // create a lexer that feeds off of input CharStream
	    ArrayInitLexer lexer = new ArrayInitLexer(input);
	    // create a buffer of tokens pulled from the lexer
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    // create a parser that feeds off the tokens buffer
	    ArrayInitParser parser = new ArrayInitParser(tokens);
	    // begin parsing at init rule
	    ParseTree tree = parser.init();
	    // print lisp style tree
	    System.out.println(tree.toStringTree(parser));
	    
    }
}
