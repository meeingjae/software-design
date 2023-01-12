package com.software.design.bridge.storebean;

import org.springframework.stereotype.Service;

@Service
public class StudentRepository extends BaseRepository {

    public StudentRepository(StoreRepository storeRepository) {
        super(storeRepository);
    }

    @Override
    public <T extends BaseEntity> T save(T entity) {
        if (entity instanceof Student) {
            storeRepository.store(entity);
            storeRepository.close();
        }
        return entity;
    }
}
