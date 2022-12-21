package com.software.design.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("전처리 이전 데이터")
public class SourceDataTest {

    @DisplayName("생성 성공")
    @Test
    void 생성_성공() {
        final int intSource = 10;
        SourceData sourceData = new SourceData(intSource);
        assertThat(sourceData).isEqualTo(new SourceData(intSource));
    }
}
