package com.software.design.abstractfactory;

public class ACoffeeMachine implements CoffeeMachine {
    @Override
    public Americano getAmericano() {
        return new AAmericano();
    }
}
