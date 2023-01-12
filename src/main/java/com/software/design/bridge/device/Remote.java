package com.software.design.bridge.device;

public class Remote {

    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void turnOn() {
        if (!device.isEnabled()) {
            device.enable();
        }
    }

    public void turnOff() {
        if (!device.isEnabled()) {
            device.disable();
        }
    }
}
