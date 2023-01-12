package com.software.design.bridge.shape;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThatNoException;

class ShapeTest {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void 생성_성공() {
        logger.isDebugEnabled();
        assertThatNoException().isThrownBy(() -> {
            Shape circle = new CircleShape(new Red());
            Shape square = new SquareShape(new Blue());
            logger.debug(circle.show());
            logger.debug(square.show());
        });
    }
}
