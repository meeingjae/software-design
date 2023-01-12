package com.software.design.bridge.store;

public class StudentRepository extends BaseRepository {

    public StudentRepository(StoreRepository storeRepository) {
        super(storeRepository);
    }

    @Override
    protected BaseEntity save(BaseEntity entity) {
        if (entity instanceof Student) {
            storeRepository.store(entity);
            storeRepository.close();
        }
        return entity;
    }
}
