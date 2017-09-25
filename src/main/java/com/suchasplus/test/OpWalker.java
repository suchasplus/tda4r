package com.suchasplus.test;

import com.suchasplus.ett.BHVType;
import com.suchasplus.ett.DSType;
import com.suchasplus.ett.DataSet;
import com.suchasplus.ett.Node;
import com.suchasplus.ett.NodeType;
import com.suchasplus.test.gen.OpBaseListener;
import com.suchasplus.test.gen.OpParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-11 21:29
 */
public class OpWalker extends OpBaseListener {
	
	List<DataSet> items = new ArrayList<>(50);
	private ParseTreeProperty<Node> ptp = new ParseTreeProperty<>();
	List<Node> nodes = new ArrayList<>(100);
	
	private int counter = -1;
	private int posId = -1;
	private synchronized int getInternalId() {
		counter++;
		return counter;
	}
	
	private synchronized int getPosId() {
		posId++;
		return posId;
	}
	
	@Override public void exitItem(OpParser.ItemContext ctx) {
		Set<BHVType> bhv = new HashSet<>();
		bhv.add(BHVType.CLICK);
		items.add(DataSet.builder()
				.ids(Arrays.asList(Integer.valueOf(ctx.getChild(2).getText()), 123456))
				.uid(1641511391L)
				.bhv(bhv)
				.type(DSType.AD)
				.frequency(1)
				.startTime(new Date())
				.endTime(new Date())
				.build());
		
		System.out.println(ptp.get(ctx));
		ptp.get(ctx).setExtra("itemid: " + ctx.getChild(2).getText());
		ptp.get(ctx).setRpId(getPosId());
		
		System.out.println("==== try get parent ====");
		if(ptp.get(ctx.getParent().getParent()) != null) {
			System.out.println(ptp.get(ctx.getParent().getParent()));
			ptp.get(ctx.getParent().getParent()).getChilds().add(ptp.get(ctx));
			ptp.get(ctx).setParentId(ptp.get(ctx.getParent().getParent()).getId());
		}
		
		System.out.println("-----------done and exit item------------");
	}
	@Override public void exitIntersect(OpParser.IntersectContext ctx) {
		ptp.get(ctx).setRpId(getPosId());
	}
	@Override public void enterIntersect(OpParser.IntersectContext ctx) {
		Node node = Node.builder()
				.id(getInternalId())
				.type(NodeType.INTERSECT)
				.childs(new LinkedList<>())
				.lpId(getPosId())
				.rpId(-1)
				.parentId(-1)
				.build();
		nodes.add(node);
		ptp.put(ctx, node);
		
		ParserRuleContext pctx = ctx.getParent().getParent().getParent();
		if(ptp.get(pctx) != null) {
			ptp.get(pctx).getChilds().add(node);
			ptp.get(ctx).setParentId(ptp.get(pctx).getId());
		}
	}
	@Override public void exitJunction(OpParser.JunctionContext ctx) {
		ptp.get(ctx).setRpId(getPosId());
	}
	@Override public void enterJunction(OpParser.JunctionContext ctx) {
		Node node = Node.builder()
				.id(getInternalId())
				.type(NodeType.JUNCTION)
				.childs(new LinkedList<>())
				.lpId(getPosId())
				.rpId(-1)
				.parentId(-1)
				.build();
		nodes.add(node);
		ptp.put(ctx, node);
		
		ParserRuleContext pctx = ctx.getParent().getParent().getParent();
		if(ptp.get(pctx) != null) {
			ptp.get(pctx).getChilds().add(node);
			ptp.get(ctx).setParentId(ptp.get(pctx).getId());
		}
	}
	@Override public void exitExclude(OpParser.ExcludeContext ctx) {
		ptp.get(ctx).setRpId(getPosId());
	}
	@Override public void enterExclude(OpParser.ExcludeContext ctx) {
		Node node = Node.builder()
				.id(getInternalId())
				.type(NodeType.EXCLUDE)
				.childs(new LinkedList<>())
				.lpId(getPosId())
				.rpId(-1)
				.parentId(-1)
				.build();
		nodes.add(node);
		ptp.put(ctx, node);
		
		ParserRuleContext pctx = ctx.getParent().getParent().getParent();
		if(ptp.get(pctx) != null) {
			ptp.get(pctx).getChilds().add(node);
			ptp.get(ctx).setParentId(ptp.get(pctx).getId());
		}
	}
	
	@Override public void enterItem(OpParser.ItemContext ctx) {
		Node node = Node.builder()
				.id(getInternalId())
				.type(NodeType.DATASET)
				.childs(null)
				.lpId(getPosId())
				.rpId(-1)
				.parentId(-1)
				.build();
		nodes.add(node);
		ptp.put(ctx, node);
	}
	
	public List<Node> getNodesByType(NodeType type) {
		return nodes.stream().filter(node-> node.getType().equals(type)).collect(Collectors.toList());
	}
	
}
