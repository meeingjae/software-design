package com.software.design.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

class DogTest {

    @Test
    void creat_dog_success() {
        assertThatNoException().isThrownBy(() -> new Dog("dog"));
    }

    @Test
    void call_dog_success() {
        final String name = "dog";
        final Dog dog = new Dog(name);
        assertThatNoException().isThrownBy(dog::call);
    }
}
