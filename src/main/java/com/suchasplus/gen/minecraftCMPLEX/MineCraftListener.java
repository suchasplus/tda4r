// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraftCMPLEX;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MineCraftParser}.
 */
public interface MineCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MineCraftParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MineCraftParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(MineCraftParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(MineCraftParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#datasetLogical}.
	 * @param ctx the parse tree
	 */
	void enterDatasetLogical(MineCraftParser.DatasetLogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#datasetLogical}.
	 * @param ctx the parse tree
	 */
	void exitDatasetLogical(MineCraftParser.DatasetLogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#intersectOp}.
	 * @param ctx the parse tree
	 */
	void enterIntersectOp(MineCraftParser.IntersectOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#intersectOp}.
	 * @param ctx the parse tree
	 */
	void exitIntersectOp(MineCraftParser.IntersectOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#junctionOp}.
	 * @param ctx the parse tree
	 */
	void enterJunctionOp(MineCraftParser.JunctionOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#junctionOp}.
	 * @param ctx the parse tree
	 */
	void exitJunctionOp(MineCraftParser.JunctionOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#excludeOp}.
	 * @param ctx the parse tree
	 */
	void enterExcludeOp(MineCraftParser.ExcludeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#excludeOp}.
	 * @param ctx the parse tree
	 */
	void exitExcludeOp(MineCraftParser.ExcludeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uploadPkg}
	 * labeled alternative in {@link MineCraftParser#uploadType}.
	 * @param ctx the parse tree
	 */
	void enterUploadPkg(MineCraftParser.UploadPkgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uploadPkg}
	 * labeled alternative in {@link MineCraftParser#uploadType}.
	 * @param ctx the parse tree
	 */
	void exitUploadPkg(MineCraftParser.UploadPkgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code campaignInfo}
	 * labeled alternative in {@link MineCraftParser#campaignType}.
	 * @param ctx the parse tree
	 */
	void enterCampaignInfo(MineCraftParser.CampaignInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code campaignInfo}
	 * labeled alternative in {@link MineCraftParser#campaignType}.
	 * @param ctx the parse tree
	 */
	void exitCampaignInfo(MineCraftParser.CampaignInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adInfo}
	 * labeled alternative in {@link MineCraftParser#adType}.
	 * @param ctx the parse tree
	 */
	void enterAdInfo(MineCraftParser.AdInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adInfo}
	 * labeled alternative in {@link MineCraftParser#adType}.
	 * @param ctx the parse tree
	 */
	void exitAdInfo(MineCraftParser.AdInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creativeInfo}
	 * labeled alternative in {@link MineCraftParser#creativeType}.
	 * @param ctx the parse tree
	 */
	void enterCreativeInfo(MineCraftParser.CreativeInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creativeInfo}
	 * labeled alternative in {@link MineCraftParser#creativeType}.
	 * @param ctx the parse tree
	 */
	void exitCreativeInfo(MineCraftParser.CreativeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#datasetValidContent}.
	 * @param ctx the parse tree
	 */
	void enterDatasetValidContent(MineCraftParser.DatasetValidContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#datasetValidContent}.
	 * @param ctx the parse tree
	 */
	void exitDatasetValidContent(MineCraftParser.DatasetValidContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#datasetType}.
	 * @param ctx the parse tree
	 */
	void enterDatasetType(MineCraftParser.DatasetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#datasetType}.
	 * @param ctx the parse tree
	 */
	void exitDatasetType(MineCraftParser.DatasetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MineCraftParser#entityId}.
	 * @param ctx the parse tree
	 */
	void enterEntityId(MineCraftParser.EntityIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MineCraftParser#entityId}.
	 * @param ctx the parse tree
	 */
	void exitEntityId(MineCraftParser.EntityIdContext ctx);
}