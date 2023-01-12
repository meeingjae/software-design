package com.software.design.bridge.storebean;

public class BaseEntity {

    protected final long id;

    protected BaseEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
