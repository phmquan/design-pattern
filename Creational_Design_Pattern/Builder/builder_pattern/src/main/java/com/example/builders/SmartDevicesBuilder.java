package com.example.builders;

import com.example.smartDevices.SmartDevices;
import com.example.smartDevices.SmartDevicesType;

//Concrete Builder định nghĩa các bước implement trong interface Builder
public class SmartDevicesBuilder implements Builder {

    private SmartDevicesType smartDevicesType;
    private String os;
    private String processor;
    private double screenSize;
    private String controlType;
    private int numberOfSim;
    private int battery;

    @Override
    public void setSmartDevicesType(SmartDevicesType smartDevicesType) {
        this.smartDevicesType = smartDevicesType;
    }

    @Override
    public void setOS(String os) {
        this.os = os;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    @Override
    public void setSIM(int numberOfSim) {
        this.numberOfSim = numberOfSim;
    }

    @Override
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public SmartDevices getResult() {
        return new SmartDevices(smartDevicesType, os, processor, screenSize, controlType, numberOfSim, battery);
    }
}
