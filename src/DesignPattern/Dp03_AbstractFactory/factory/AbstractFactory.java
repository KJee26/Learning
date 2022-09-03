package DesignPattern.Dp03_AbstractFactory.factory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.enums.AnimalEnum;
import DesignPattern.enums.FruitEnum;
import DesignPattern.Dp03_AbstractFactory.entity.Fruit;

/**
 * 为 Animal 和 Fruit 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {
    public abstract Animal act(AnimalEnum animalEnum);
    public abstract Fruit getColor(FruitEnum fruitEnum);
}
