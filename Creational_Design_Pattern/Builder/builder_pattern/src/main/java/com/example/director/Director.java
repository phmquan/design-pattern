package com.example.director;

import com.example.builders.Builder;
import com.example.smartDevices.SmartDevicesType;

//Director quy định các bước để tạo nên object. Nó thực hiện với builder object thông qua interface Builder chung. 
//Vì vậy lớp này sẽ không biết được đối tượng nào sẽ được xây dựng
public class Director {

    public void contructIOSPhone(Builder builder) {
        builder.setSmartDevicesType(SmartDevicesType.PHONE);
        builder.setOS("IOS");
        builder.setProcessor("Apple A15");
        builder.setControlType("Touch screen");
        builder.setBattery(3500);
        builder.setScreenSize(6.9);
        builder.setSIM(2);
    }

    public void contructAndroidPhone(Builder builder) {
        builder.setSmartDevicesType(SmartDevicesType.PHONE);
        builder.setOS("Android");
        builder.setProcessor("Qualcomm Snapdragon 8 Gen 2");
        builder.setControlType("Touch screen");
        builder.setBattery(5000);
        builder.setScreenSize(6.5);
        builder.setSIM(2);
    }

    public void contructTablet(Builder builder) {
        builder.setSmartDevicesType(SmartDevicesType.TABLET);
        builder.setOS("Android");
        builder.setProcessor("Qualcomm Snapdragon 8 Gen 2");
        builder.setControlType("Touch screen");
        builder.setBattery(3500);
        builder.setScreenSize(6.9);
    }

    public void contructTV(Builder builder) {
        builder.setSmartDevicesType(SmartDevicesType.TV);
        builder.setOS("Android");
        builder.setProcessor("Qualcomm Snapdragon 8 Gen 2");
        builder.setControlType("Remote Controller");
        builder.setScreenSize(24);
    }
}
