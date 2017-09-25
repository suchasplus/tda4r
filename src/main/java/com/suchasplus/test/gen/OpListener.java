// Generated from C:/dev/IdeaProjects/parser/src/main/resources\Op.g4 by ANTLR 4.7
package com.suchasplus.test.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpParser}.
 */
public interface OpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(OpParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(OpParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(OpParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(OpParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpParser#intersect}.
	 * @param ctx the parse tree
	 */
	void enterIntersect(OpParser.IntersectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#intersect}.
	 * @param ctx the parse tree
	 */
	void exitIntersect(OpParser.IntersectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpParser#junction}.
	 * @param ctx the parse tree
	 */
	void enterJunction(OpParser.JunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#junction}.
	 * @param ctx the parse tree
	 */
	void exitJunction(OpParser.JunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpParser#exclude}.
	 * @param ctx the parse tree
	 */
	void enterExclude(OpParser.ExcludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#exclude}.
	 * @param ctx the parse tree
	 */
	void exitExclude(OpParser.ExcludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(OpParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(OpParser.ItemContext ctx);
}