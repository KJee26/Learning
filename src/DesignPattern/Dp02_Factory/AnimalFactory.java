package DesignPattern.Dp02_Factory;

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
