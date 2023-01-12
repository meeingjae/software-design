package com.software.design.bridge.device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public String getDeviceType() {
        return super.device.getClass().getSimpleName();
    }
}
