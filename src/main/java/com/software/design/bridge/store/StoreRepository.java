package com.software.design.bridge.store;

public interface StoreRepository {

    void store(BaseEntity baseEntity);

    void close();
}
