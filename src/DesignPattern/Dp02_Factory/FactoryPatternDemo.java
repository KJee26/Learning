package DesignPattern.Dp02_Factory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.Dp02_Factory.factory.AnimalFactory;
import DesignPattern.utils.AnimalEnum;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        // 获取三种动物
        Animal dog = animalFactory.getAnimal(AnimalEnum.DOG);
        dog.act();

        Animal duck = animalFactory.getAnimal(AnimalEnum.DUCK);
        duck.act();

        Animal chicken = animalFactory.getAnimal(AnimalEnum.CHICKEN);
        chicken.act();
    }
}
