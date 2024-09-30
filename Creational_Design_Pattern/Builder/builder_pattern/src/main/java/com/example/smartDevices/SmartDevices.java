package com.example.smartDevices;
//SmartDevices là class Product trong cấu trúc của Builder Pattern

public class SmartDevices {

    private final SmartDevicesType smartDevicesType;
    private final String os;
    private final String processor;
    private final double screenSize;
    private final String controlType;
    private final int numberOfSim;
    private final int battery;

    public SmartDevices(com.example.smartDevices.SmartDevicesType smartDevicesType, String os, String processor,
            double screenSize, String controlType, int numberOfSim, int battery) {
        this.smartDevicesType = smartDevicesType;
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.controlType = controlType;
        this.numberOfSim = numberOfSim;
        this.battery = battery;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getControlType() {
        return controlType;
    }

    public int getNumberOfSim() {
        return numberOfSim;
    }

    public int getBattery() {
        return battery;
    }

    public SmartDevicesType getSmartDevicesType() {
        return smartDevicesType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmartDevices{");
        sb.append("smartDevicesType=").append(smartDevicesType);
        sb.append(", os=").append(os);
        sb.append(", processor=").append(processor);
        sb.append(", screenSize=").append(screenSize);
        sb.append(", controlType=").append(controlType);
        sb.append(", numberOfSim=").append(numberOfSim);
        sb.append(", battery=").append(battery);
        sb.append('}');
        return sb.toString();
    }

}
