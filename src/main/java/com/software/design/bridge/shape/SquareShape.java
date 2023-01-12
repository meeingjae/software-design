package com.software.design.bridge.shape;

public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }

    @Override
    protected String show() {

        return "사각형 + " + super.color.draw();
    }
}
