package com.suchasplus.ett;

import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright 2009-2017 Weibo, Inc. suchasplus@2017-09-25 15:38
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Node {
	@Builder.Default
	private int lpId = -1;
	@Builder.Default
	private int rpId = -1;
	
	@Builder.Default
	private boolean done = false;
	
	private int id;
	
	@Builder.Default
	private int parentId = -1;
	
	private NodeType type;
	
	private LinkedList<Node> childs;
	
	@Builder.Default
	private String extra = "";
	
	public void print() {
		System.out.println("Node : " + id +", parent:" + parentId+ " lr: " + lpId + "-" +rpId +", type: " + type +
				", "
				+ "extra:" + extra +
				"\n\n");
	}
	
	public String getDotOrient() {
		return '"' + type.toString() + ":" + id + '"';
	}
	public String getDotDesc() {
		return getDotOrient() + "[shape=\""+ getSharp() +"\"]";
	}
	
	private String getSharp() {
		String ret = "circle";
		switch (type) {
			case INTERSECT:
				ret = "tripleoctagon";
				break;
			case JUNCTION:
				ret = "house";
				break;
			case EXCLUDE:
				ret = "pentagon";
				break;
			case DATASET:
				ret = "ellipse";
				break;
		}
		return ret;
	}
}
