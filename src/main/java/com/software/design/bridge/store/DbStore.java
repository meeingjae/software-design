package com.software.design.bridge.store;

public class DbStore implements StoreRepository{
    @Override
    public void store(BaseEntity baseEntity) {
        System.out.println("DB 저장");
    }

    @Override
    public void close() {
        System.out.println("DB 저장 종료");
    }
}
