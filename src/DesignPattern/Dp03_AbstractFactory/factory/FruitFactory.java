package DesignPattern.Dp03_AbstractFactory.factory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.utils.AnimalEnum;
import DesignPattern.utils.FruitEnum;
import DesignPattern.Dp03_AbstractFactory.entity.Apple;
import DesignPattern.Dp03_AbstractFactory.entity.Banana;
import DesignPattern.Dp03_AbstractFactory.entity.Fruit;
import DesignPattern.Dp03_AbstractFactory.entity.Grape;

public class FruitFactory extends AbstractFactory{
    @Override
    public Animal act(AnimalEnum animalEnum) {
        return null;
    }

    @Override
    public Fruit getColor(FruitEnum fruitEnum) {
        return switch(fruitEnum) {
            case APPLE -> new Apple();
            case BANANA -> new Banana();
            case GRAPE -> new Grape();
            default -> null;
        };
    }
}
