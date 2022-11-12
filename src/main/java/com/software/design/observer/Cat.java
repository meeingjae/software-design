package com.software.design.observer;

import java.util.Objects;

public class Cat implements Animal {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void call() {
        System.out.printf(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
