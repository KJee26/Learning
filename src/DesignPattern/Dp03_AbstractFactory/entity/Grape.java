package DesignPattern.Dp03_AbstractFactory.entity;

public class Grape implements Fruit {
    @Override
    public void getColor() {
        System.out.println("grape is purple");
    }
}
