package com.software.design.observer;

import java.util.Objects;

public class Dog implements Animal {
    private final String name;

    public Dog(String name) {
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
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
