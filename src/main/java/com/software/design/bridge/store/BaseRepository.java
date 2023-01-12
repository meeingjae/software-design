package com.software.design.bridge.store;

public abstract class BaseRepository {

    protected StoreRepository storeRepository;

    protected BaseRepository(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    protected abstract BaseEntity save(BaseEntity entity);
}
