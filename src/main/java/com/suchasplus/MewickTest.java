package com.suchasplus;

import com.suchasplus.gen.MewickLexer;
import com.suchasplus.gen.MewickParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Powered by suchasplus@gmail.com on 2017/9/11.
 */
public class MewickTest {
    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromStream(
                Thread.currentThread().getContextClassLoader().getResourceAsStream("test.mewick"));
        MewickParser parser = new MewickParser(new CommonTokenStream(new MewickLexer(input)));
        ParseTree tree = parser.entity();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        MewickListener listener = new MewickListener();
        walker.walk(listener, tree);

        System.out.println(listener.getItems());

        listener.tree.annotations.forEach((keySet, val) -> {
            System.out.println(val);
        });

        System.out.println("==================");
        MyMap<Entity> entities = listener.tree;
        System.out.println(entities.get(listener.root).children.size());
    }
}
