package com.software.design.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

class CatTest {

    @Test
    void creat_cat_success() {
        assertThatNoException().isThrownBy(() -> new Cat("cat"));
    }

    @Test
    void call_cat_success() {
        final String name = "cat";
        final Cat cat = new Cat(name);
        assertThatNoException().isThrownBy(cat::call);
    }
}
