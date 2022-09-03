package DesignPattern.Dp05_PrototypePattern.ext;

import DesignPattern.Dp05_PrototypePattern.Shape;

public class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
