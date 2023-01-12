package com.software.design.bridge.storebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfiguration {

    @Bean
    StoreRepository storeRepository() {
        return new DbStore();
    }
}
