package DesignPattern.Dp04_BuilderPattern.itemImpl.coldDrink;

import DesignPattern.Dp04_BuilderPattern.item.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
