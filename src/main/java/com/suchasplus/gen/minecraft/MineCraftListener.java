// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraft;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MineCraftParser}.
 */
public interface MineCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#exclude}.
	 * @param ctx the parse tree
	 */
	void enterExclude(MineCraftParser.ExcludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#exclude}.
	 * @param ctx the parse tree
	 */
	void exitExclude(MineCraftParser.ExcludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#dataset}.
	 * @param ctx the parse tree
	 */
	void enterDataset(MineCraftParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#dataset}.
	 * @param ctx the parse tree
	 */
	void exitDataset(MineCraftParser.DatasetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#pkg}.
	 * @param ctx the parse tree
	 */
	void enterPkg(MineCraftParser.PkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#pkg}.
	 * @param ctx the parse tree
	 */
	void exitPkg(MineCraftParser.PkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(MineCraftParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(MineCraftParser.FrequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#timespan}.
	 * @param ctx the parse tree
	 */
	void enterTimespan(MineCraftParser.TimespanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#timespan}.
	 * @param ctx the parse tree
	 */
	void exitTimespan(MineCraftParser.TimespanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#userbhv}.
	 * @param ctx the parse tree
	 */
	void enterUserbhv(MineCraftParser.UserbhvContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#userbhv}.
	 * @param ctx the parse tree
	 */
	void exitUserbhv(MineCraftParser.UserbhvContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#pkgtype}.
	 * @param ctx the parse tree
	 */
	void enterPkgtype(MineCraftParser.PkgtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#pkgtype}.
	 * @param ctx the parse tree
	 */
	void exitPkgtype(MineCraftParser.PkgtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#pkgids}.
	 * @param ctx the parse tree
	 */
	void enterPkgids(MineCraftParser.PkgidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#pkgids}.
	 * @param ctx the parse tree
	 */
	void exitPkgids(MineCraftParser.PkgidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#entity_ubhv}.
	 * @param ctx the parse tree
	 */
	void enterEntity_ubhv(MineCraftParser.Entity_ubhvContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#entity_ubhv}.
	 * @param ctx the parse tree
	 */
	void exitEntity_ubhv(MineCraftParser.Entity_ubhvContext ctx);
}