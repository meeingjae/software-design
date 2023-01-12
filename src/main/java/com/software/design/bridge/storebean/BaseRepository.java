package com.software.design.bridge.storebean;

public abstract class BaseRepository {

    protected StoreRepository storeRepository;

    protected BaseRepository(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    protected abstract <T extends BaseEntity> T save(T entity);
}
