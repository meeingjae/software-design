package com.software.design.abstractfactory;

public class CCoffeeMachine implements CoffeeMachine {
    @Override
    public Americano getAmericano() {
        return new CAmericano();
    }
}
