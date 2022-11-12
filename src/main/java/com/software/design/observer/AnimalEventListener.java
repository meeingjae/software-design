package com.software.design.observer;

import java.util.HashSet;
import java.util.Set;

public class AnimalEventListener {
    private final Set<Animal> subscriber;

    public AnimalEventListener() {
        subscriber = new HashSet<>();
    }

    public void subscribe(Animal animal) {
        this.subscriber.add(animal);
    }

    public void unSubscribe(Animal animal) {
        if (subscriber.contains(animal)) {
            subscriber.remove(animal);
        }
    }

    public int subscriberSize() {
        return subscriber.size();
    }

    public void action() {
        subscriber.forEach(Animal::call);
    }
}
