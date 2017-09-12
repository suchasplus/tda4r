package com.suchasplus;

import com.suchasplus.gen.MewickBaseListener;
import com.suchasplus.gen.MewickParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Powered by suchasplus@gmail.com on 2017/9/11.
 */
public class MewickListener extends MewickBaseListener {

    MyMap<Entity> tree = new MyMap<>();
    List<String> items = new ArrayList<>();
    public int counter;
    MewickParser.EntityContext root = null;


    @Override public void enterEntity(MewickParser.EntityContext ctx) {
        if(root == null) {
            root = ctx;
        }

    }
    @Override public void exitEntity(MewickParser.EntityContext ctx) {
        counter++;
    }

    @Override public void enterItem(MewickParser.ItemContext ctx) {
        //System.out.println(ctx.INT().getText());


    }

    @Override public void exitItem(MewickParser.ItemContext ctx) {
        items.add("item : " + ctx.getText());
        Entity e = new Entity();
        e.type = "ITEM";
        e.pkId = counter;
        e.value = String.valueOf(ctx.INT().getText());
        tree.put(ctx.getParent(), e);
        System.out.println(e);
        System.out.println(ctx);
        System.out.println(ctx.getParent());
        System.out.println("=================");
    }

    @Override public void exitIntersect(MewickParser.IntersectContext ctx) {
        Entity e = new Entity();
        e.type = "INTERSECT";
        e.pkId = counter;
        IntStream.range(0, ctx.getChildCount()).forEach((idx)->{
            ParseTree cld = ctx.getChild(idx);
            if(tree.get(cld) != null) {
                e.children.add(tree.get(cld));
            }
        });
        tree.put(ctx.getParent(), e);
        System.out.println(e);
        System.out.println("=================");
    }

    @Override public void exitJunction(MewickParser.JunctionContext ctx) {
        Entity e = new Entity();
        e.type = "JUNCTION";
        e.pkId = counter;
        IntStream.range(0, ctx.getChildCount()).forEach((idx)->{
            ParseTree cld = ctx.getChild(idx);
            if(tree.get(cld) != null) {
                e.children.add(tree.get(cld));
            }
        });
        tree.put(ctx.getParent(), e);
        System.out.println(e);
        System.out.println("=================");
    }

    @Override public void exitExclude(MewickParser.ExcludeContext ctx) {
        Entity e = new Entity();
        e.type = "Exclude";
        e.pkId = counter;
        IntStream.range(0, ctx.getChildCount()).forEach((idx)->{
            System.out.println(ctx.getChild(idx).getText());
            ParseTree cld = ctx.getChild(idx);
            System.out.println(cld);
            if(tree.get(cld) != null) {
                e.children.add(tree.get(cld));
            }
        });
        tree.put(ctx.getParent(), e);
        System.out.println(ctx);
        System.out.println(e);
        System.out.println("=================");
    }

    public List<String> getItems() {
        return items;
    }

}
