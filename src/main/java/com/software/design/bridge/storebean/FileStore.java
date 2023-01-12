package com.software.design.bridge.storebean;

public class FileStore implements StoreRepository {
    @Override
    public void store(BaseEntity baseEntity) {
        System.out.println("파일 저장");
    }

    @Override
    public void close() {
        System.out.println("파일 저장 종료");
    }
}
