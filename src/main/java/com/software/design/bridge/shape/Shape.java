package com.software.design.bridge.shape;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    protected abstract String show();
}
