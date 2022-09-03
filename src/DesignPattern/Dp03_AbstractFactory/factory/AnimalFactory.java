package DesignPattern.Dp03_AbstractFactory.factory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.enums.AnimalEnum;
import DesignPattern.Dp02_Factory.entity.Chicken;
import DesignPattern.Dp02_Factory.entity.Dog;
import DesignPattern.Dp02_Factory.entity.Duck;
import DesignPattern.enums.FruitEnum;
import DesignPattern.Dp03_AbstractFactory.entity.Fruit;

public class AnimalFactory extends AbstractFactory{
    @Override
    public Animal act(AnimalEnum animalEnum) {
        return switch(animalEnum) {
            case DOG -> new Dog();
            case CHICKEN -> new Chicken();
            case DUCK -> new Duck();
            default -> null;
        };
    }

    @Override
    public Fruit getColor(FruitEnum fruitEnum) {
        return null;
    }
}
