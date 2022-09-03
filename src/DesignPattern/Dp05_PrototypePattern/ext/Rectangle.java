package DesignPattern.Dp05_PrototypePattern.ext;

import DesignPattern.Dp05_PrototypePattern.Shape;

public  class Rectangle extends Shape {
    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
