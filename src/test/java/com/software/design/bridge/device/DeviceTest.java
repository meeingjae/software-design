package com.software.design.bridge.device;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

public class DeviceTest {

    @Test
    void 기본_리모컨() {
        assertThatNoException().isThrownBy(() -> {
            Remote remote = new Remote(new TV());
            remote.turnOn();
        });
    }

    @Test
    void 좋은_기본_리모컨() {
        AdvancedRemote remote = new AdvancedRemote(new TV());
        remote.turnOn();
        final String type = remote.getDeviceType();
        System.out.println("type : " + type);
        assertThat(type).isEqualTo(TV.class.getSimpleName());
    }
}
