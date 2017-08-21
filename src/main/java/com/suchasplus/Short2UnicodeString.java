package com.suchasplus;

import com.suchasplus.gen.arrayinit.ArrayInitBaseListener;
import com.suchasplus.gen.arrayinit.ArrayInitParser;

/**
 * Copyright 2009-2017 Weibo, Inc.
 * suchasplus@2017-08-21 16:50
 */
public class Short2UnicodeString extends ArrayInitBaseListener {
	
	@Override //translate { to "
	public void enterInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}
	
	@Override //translate } to "
	public void exitInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}
	
	@Override
	public void enterValue(ArrayInitParser.ValueContext ctx) {
		// assumes no nested array initializes
		int value = Integer.valueOf(ctx.INT().getText());
		System.out.printf("\\u%04x", value);
	}
}
