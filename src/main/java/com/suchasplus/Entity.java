package com.suchasplus;

import java.util.ArrayList;
import java.util.List;

/**
 * Powered by suchasplus@gmail.com on 2017/9/11.
 */

public class Entity {
    public String type;
    public int pkId;
    public List<Entity> children = new ArrayList<>();
    public String value;

    @Override
    public String toString() {
        return "Entity{" +
                "type='" + type + '\'' +
                ", pkId=" + pkId +
                ", children=" + children +
                ", value='" + value + '\'' +
                '}';
    }
}
