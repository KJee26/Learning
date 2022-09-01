package DesignPattern.Dp03_AbstractFactory.entity;

public class Banana implements Fruit {
    @Override
    public void getColor() {
        System.out.println("banana is yellow");
    }
}
