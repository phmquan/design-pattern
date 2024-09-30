package com.example.builders;

import com.example.smartDevices.SmartDevicesType;

//interface builder định nghĩa mọi cách có thể để tạo nên một đối tượng
public interface Builder {

    public void setSmartDevicesType(SmartDevicesType smartDevicesType);

    public void setOS(String os);

    public void setProcessor(String processor);

    public void setScreenSize(double screenSize);

    public void setControlType(String controlType);

    public void setSIM(int numberOfSim);

    public void setBattery(int battery);
}
