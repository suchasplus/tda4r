package com.suchasplus.test;

import com.suchasplus.ett.Node;
import com.suchasplus.ett.NodeType;
import com.suchasplus.test.gen.OpLexer;
import com.suchasplus.test.gen.OpParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-11 21:14
 */
public class TestOp {
	
	public static void main(String[] args) throws IOException {
		InputStream is =
				ClassLoader.getSystemResourceAsStream("test.op.mc");
		CharStream input = CharStreams.fromStream(is);
		OpParser parser = new OpParser(new CommonTokenStream(new OpLexer(input)));
		ParseTree tree = parser.entity();
		System.out.println(tree.toStringTree(parser));
		
		ParseTreeWalker walker = new ParseTreeWalker();
		OpWalker wk = new OpWalker();
		walker.walk(wk, tree);
		
		System.out.println(wk.items);
		System.out.println(wk.nodes);
		
		System.out.println("----------");
		System.out.println(wk.getNodesByType(NodeType.EXCLUDE));
		System.out.println(wk.getNodesByType(NodeType.INTERSECT));
		
		System.out.println("----------------=================----------------");
		wk.nodes.forEach(Node::print);
		
		System.out.println(getDot(wk.nodes));
		Map<Integer, Node> nodeMap = wk.nodes.stream().collect(Collectors.toMap(Node::getId, Function.identity()));
		LinkedList<Node> opList = getOrder(nodeMap);

		opList.forEach(System.out::println);
	}
	
	private static String getDot(List<Node> nodes) {
		Map<Integer, Node> map = nodes.stream().collect(Collectors.toMap(Node::getId, Function.identity()));
		
		StringBuilder desc = new StringBuilder();
		nodes.forEach(node -> {
			desc.append(node.getDotDesc());
			desc.append(";\n");
		});
		
		nodes.forEach(node -> {
			if(node.getParentId() != -1) {
				desc.append(node.getDotOrient());
				desc.append(" -> ");
				desc.append(map.get(node.getParentId()).getDotOrient());
				desc.append(";\n");
			}
		});
		return desc.toString();
	}
	
	private static LinkedList<Node> getOrder(Map<Integer, Node> map) {
		LinkedList<Node> ret = new LinkedList<>();
		//set datasets all done
		map.forEach((k,v)->{
			if(v.getType().equals(NodeType.DATASET)) {
				v.setDone(true);
			}
		});
		int counter = 0;
		while(!map.get(0).isDone()) {
			counter++;
			map.forEach((k, v) -> {
				List<Node> childs = v.getChilds();
				//if all childs is done, then add to ret and set this one done
				if(childs != null&& !v.isDone() && (childs.stream().filter(Node::isDone).count() == childs.size())) {
					ret.add(v);
					v.setDone(true);
				}
			});
		}
		System.out.println("=============loop : " + counter);
		return ret;
	}
}
