package DesignPattern.Dp02_Factory.entity;

public class Dog implements Animal {
    @Override
    public void act() {
        System.out.println("wang wang!");
    }
}
