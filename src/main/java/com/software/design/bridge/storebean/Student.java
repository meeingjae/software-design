package com.software.design.bridge.storebean;

public class Student extends BaseEntity {

    private final String name;

    public Student(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
