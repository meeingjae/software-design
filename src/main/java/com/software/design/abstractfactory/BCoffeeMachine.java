package com.software.design.abstractfactory;

public class BCoffeeMachine implements CoffeeMachine {
    @Override
    public Americano getAmericano() {
        return new BAmericano();
    }
}
