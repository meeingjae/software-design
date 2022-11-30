package com.software.design.abstractfactory;

public class DCoffeeMachine implements LatteCoffeeMachine {
    @Override
    public Americano getAmericano() {
        return new DAmericano();
    }

    @Override
    public Latte getLatte() {
        return new DLatte();
    }
}
