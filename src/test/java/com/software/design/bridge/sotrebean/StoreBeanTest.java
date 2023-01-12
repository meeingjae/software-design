package com.software.design.bridge.sotrebean;

import com.software.design.bridge.storebean.Student;
import com.software.design.bridge.storebean.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatNoException;

@SpringBootTest
public class StoreBeanTest {

    @Autowired
    StudentRepository repository;

    @Test
    void 생성_성공() {
        assertThatNoException().isThrownBy(() -> repository.save(new Student(1l, "밍밍")));
    }
}
