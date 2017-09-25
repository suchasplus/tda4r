// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraft;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MineCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MineCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#exclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude(MineCraftParser.ExcludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(MineCraftParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#pkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg(MineCraftParser.PkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#frequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency(MineCraftParser.FrequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#timespan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimespan(MineCraftParser.TimespanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#userbhv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserbhv(MineCraftParser.UserbhvContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#pkgtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgtype(MineCraftParser.PkgtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#pkgids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgids(MineCraftParser.PkgidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#entity_ubhv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_ubhv(MineCraftParser.Entity_ubhvContext ctx);
}