package DesignPattern.Dp04_BuilderPattern.item;

import DesignPattern.Dp04_BuilderPattern.pack.Packing;
import DesignPattern.Dp04_BuilderPattern.pack.Bottle;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
