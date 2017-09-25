// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraftCMPLEX;
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
	 * Visit a parse tree produced by {@link MineCraftParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MineCraftParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(MineCraftParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#datasetLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetLogical(MineCraftParser.DatasetLogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#intersectOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectOp(MineCraftParser.IntersectOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#junctionOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunctionOp(MineCraftParser.JunctionOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#excludeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludeOp(MineCraftParser.ExcludeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uploadPkg}
	 * labeled alternative in {@link MineCraftParser#uploadType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUploadPkg(MineCraftParser.UploadPkgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code campaignInfo}
	 * labeled alternative in {@link MineCraftParser#campaignType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampaignInfo(MineCraftParser.CampaignInfoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adInfo}
	 * labeled alternative in {@link MineCraftParser#adType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdInfo(MineCraftParser.AdInfoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creativeInfo}
	 * labeled alternative in {@link MineCraftParser#creativeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreativeInfo(MineCraftParser.CreativeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#datasetValidContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetValidContent(MineCraftParser.DatasetValidContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#datasetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetType(MineCraftParser.DatasetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MineCraftParser#entityId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityId(MineCraftParser.EntityIdContext ctx);
}