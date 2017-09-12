// Generated from D:/Dev/github/tda4r/src/main/resources\Mewick.g4 by ANTLR 4.7
package com.suchasplus.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MewickParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MewickVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MewickParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(MewickParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MewickParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(MewickParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MewickParser#intersect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect(MewickParser.IntersectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MewickParser#junction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunction(MewickParser.JunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MewickParser#exclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude(MewickParser.ExcludeContext ctx);
}