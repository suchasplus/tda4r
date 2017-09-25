// Generated from C:/dev/IdeaProjects/parser/src/main/resources\Op.g4 by ANTLR 4.7
package com.suchasplus.test.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OpParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(OpParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(OpParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpParser#intersect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect(OpParser.IntersectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpParser#junction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunction(OpParser.JunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpParser#exclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude(OpParser.ExcludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(OpParser.ItemContext ctx);
}