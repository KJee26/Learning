package DesignPattern.Dp05_PrototypePattern.ext;

import DesignPattern.Dp05_PrototypePattern.Shape;

public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
