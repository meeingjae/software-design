package com.software.design.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;

class AnimalEventListenerTest {

    @Test
    void subscribe_animal_success() {
        final AnimalEventListener animalEventListener = new AnimalEventListener();
        animalEventListener.subscribe(new Cat("cat"));
        animalEventListener.subscribe(new Dog("dog"));
        assertThat(animalEventListener.subscriberSize()).isEqualTo(2);
    }

    @Test
    void unsubscribe_animal_success() {
        final AnimalEventListener animalEventListener = new AnimalEventListener();
        final Cat cat = new Cat("cat");
        final Dog dog = new Dog("dog");
        animalEventListener.subscribe(cat);
        animalEventListener.subscribe(dog);
        animalEventListener.unSubscribe(cat);
        assertThat(animalEventListener.subscriberSize()).isEqualTo(1);
    }

    @Test
    void action_event_success() {
        final AnimalEventListener animalEventListener = new AnimalEventListener();
        final Cat cat = new Cat("cat");
        final Dog dog = new Dog("dog");
        animalEventListener.subscribe(cat);
        animalEventListener.subscribe(dog);
        assertThatNoException().isThrownBy(animalEventListener::action);
    }
}
