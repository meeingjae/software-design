package com.software.design.bridge.device;

public class Radio implements Device{

    private boolean enable = false;
    @Override
    public boolean isEnabled() {
        return this.enable;
    }

    @Override
    public void enable() {
        System.out.println("Radio enabled");
        this.enable = true;
    }

    @Override
    public void disable() {
        System.out.println("Radio disabled");
        this.enable = false;
    }
}
