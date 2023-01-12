package com.software.design.bridge.storebean;

public interface StoreRepository {

    void store(BaseEntity baseEntity);

    void close();
}
