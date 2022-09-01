package DesignPattern.Dp04_BuilderPattern.itemImpl.burger;

import DesignPattern.Dp04_BuilderPattern.item.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
