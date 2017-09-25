package com.suchasplus;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Powered by suchasplus@gmail.com on 2017/9/12.
 */
public class MyMap<V> {
    public Map<ParseTree, V> annotations = new IdentityHashMap();

    public MyMap() {
    }

    public V get(ParseTree node) {
        return this.annotations.get(node);
    }

    public void put(ParseTree node, V value) {
        this.annotations.put(node, value);
    }

    public V removeFrom(ParseTree node) {
        return this.annotations.remove(node);
    }
}
