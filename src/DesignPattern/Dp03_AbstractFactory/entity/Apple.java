package DesignPattern.Dp03_AbstractFactory.entity;

public class Apple implements Fruit {
    @Override
    public void getColor() {
        System.out.println("apple is red");
    }
}
