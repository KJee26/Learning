package DesignPattern.Dp02_Factory.factory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.Dp02_Factory.entity.Chicken;
import DesignPattern.Dp02_Factory.entity.Dog;
import DesignPattern.Dp02_Factory.entity.Duck;
import DesignPattern.utils.AnimalEnum;

public class AnimalFactory {

    public Animal getAnimal(AnimalEnum animalEnum) {
        return switch (animalEnum) {
            case DOG -> new Dog();
            case CHICKEN -> new Chicken();
            case DUCK -> new Duck();
            default -> throw new IllegalStateException("Unexpected value: " + animalEnum);
        };
    }
}
