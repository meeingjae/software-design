package com.software.design.bridge.device;

public class TV implements Device {

    private boolean enable = false;

    @Override
    public boolean isEnabled() {
        return this.enable;
    }

    @Override
    public void enable() {
        System.out.println("TV enabled");
        this.enable = true;
    }

    @Override
    public void disable() {
        System.out.println("TV disabled");
        this.enable = false;
    }
}
