package DesignPattern.Dp04_BuilderPattern.itemImpl.coldDrink;

import DesignPattern.Dp04_BuilderPattern.item.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
