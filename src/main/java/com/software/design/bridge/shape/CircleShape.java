package com.software.design.bridge.shape;

public class CircleShape extends Shape {
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    protected String show() {
        return "원 + " + super.color.draw();
    }
}
