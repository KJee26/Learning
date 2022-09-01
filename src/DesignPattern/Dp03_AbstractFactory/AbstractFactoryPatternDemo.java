package DesignPattern.Dp03_AbstractFactory;

import DesignPattern.Dp02_Factory.entity.Animal;
import DesignPattern.utils.AnimalEnum;
import DesignPattern.Dp03_AbstractFactory.entity.Fruit;
import DesignPattern.Dp03_AbstractFactory.factory.AbstractFactory;
import DesignPattern.Dp03_AbstractFactory.producer.FactoryProducer;
import DesignPattern.utils.FruitEnum;

/**
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory animal = FactoryProducer.getFactory("animal");
        Animal dog = animal.act(AnimalEnum.DOG);
        dog.act();

        AbstractFactory fruit = FactoryProducer.getFactory("fruit");
        Fruit apple = fruit.getColor(FruitEnum.APPLE);
        apple.getColor();
    }
}
