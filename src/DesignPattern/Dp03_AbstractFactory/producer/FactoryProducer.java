package DesignPattern.Dp03_AbstractFactory.producer;

import DesignPattern.Dp03_AbstractFactory.factory.AbstractFactory;
import DesignPattern.Dp03_AbstractFactory.factory.AnimalFactory;
import DesignPattern.Dp03_AbstractFactory.factory.FruitFactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递动物或水果信息来获取工厂。
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "animal": return new AnimalFactory();
            case "fruit": return new FruitFactory();
            default:return null;
        }
    }
}
