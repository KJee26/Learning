package DesignPattern.Dp02_Factory;

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
