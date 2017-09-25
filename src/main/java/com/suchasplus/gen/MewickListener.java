// Generated from D:/Dev/github/tda4r/src/main/resources\Mewick.g4 by ANTLR 4.7
package com.suchasplus.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MewickParser}.
 */
public interface MewickListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MewickParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(MewickParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MewickParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(MewickParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MewickParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(MewickParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MewickParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(MewickParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MewickParser#intersect}.
	 * @param ctx the parse tree
	 */
	void enterIntersect(MewickParser.IntersectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MewickParser#intersect}.
	 * @param ctx the parse tree
	 */
	void exitIntersect(MewickParser.IntersectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MewickParser#junction}.
	 * @param ctx the parse tree
	 */
	void enterJunction(MewickParser.JunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MewickParser#junction}.
	 * @param ctx the parse tree
	 */
	void exitJunction(MewickParser.JunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MewickParser#exclude}.
	 * @param ctx the parse tree
	 */
	void enterExclude(MewickParser.ExcludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MewickParser#exclude}.
	 * @param ctx the parse tree
	 */
	void exitExclude(MewickParser.ExcludeContext ctx);
}