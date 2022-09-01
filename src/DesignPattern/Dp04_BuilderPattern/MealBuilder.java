package DesignPattern.Dp04_BuilderPattern;

import DesignPattern.Dp04_BuilderPattern.itemImpl.burger.ChickenBurger;
import DesignPattern.Dp04_BuilderPattern.itemImpl.burger.VegBurger;
import DesignPattern.Dp04_BuilderPattern.itemImpl.coldDrink.Coke;
import DesignPattern.Dp04_BuilderPattern.itemImpl.coldDrink.Pepsi;

/**
 * 负责创建 Meal 对象。
 */
public class MealBuilder {

    public Meal prepareVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
