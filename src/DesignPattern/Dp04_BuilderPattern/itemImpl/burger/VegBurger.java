package DesignPattern.Dp04_BuilderPattern.itemImpl.burger;

import DesignPattern.Dp04_BuilderPattern.item.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
