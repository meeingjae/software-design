package com.software.design.bridge.store;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;

class StoreTest {

    @Test
    void 학생_생성_성공_DB() {
        assertThatNoException().isThrownBy(() -> {
            BaseRepository baseRepository = new StudentRepository(new DbStore());
            baseRepository.save(new Student(1l, "김밍재"));
        });
    }

    @Test
    void 학생_생성_성공_File() {
        assertThatNoException().isThrownBy(() -> {
            BaseRepository baseRepository = new StudentRepository(new FileStore());
            baseRepository.save(new Student(2l, "밍밍"));
        });
    }
}
