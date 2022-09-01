package DesignPattern.Dp04_BuilderPattern.item;

import DesignPattern.Dp04_BuilderPattern.pack.Packing;

/**
 * 创建一个食物条目的接口。
 */
public interface Item {
    public String name();

    public float price();

    public Packing packing();
}
