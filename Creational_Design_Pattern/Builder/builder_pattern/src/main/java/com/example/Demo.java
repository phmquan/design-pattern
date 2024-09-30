package com.example;

import java.util.Scanner;

import com.example.builders.SmartDevicesBuilder;
import com.example.director.Director;
import com.example.smartDevices.SmartDevices;

//Chạy chương trình. Khởi tạo các class Director và SmartDevicesBuilder để khởi tạo
//đối tượng theo yêu cầu của người dùng và xuất ra thông tin thiết bị2
public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Director director = new Director();
        SmartDevicesBuilder smartDevicesBuilder = new SmartDevicesBuilder();

        System.out.println("Choose the smart device to create: ");
        System.out.println("1. Iphone ");
        System.out.println("2. Android Phone");
        System.out.println("3. Tablet ");
        System.out.println("4. Smart TV ");

        int input = Integer.parseInt(scan.nextLine());
        switch (input) {
            case 1 -> {
                director.contructIOSPhone(smartDevicesBuilder);
            }
            case 2 -> {
                director.contructAndroidPhone(smartDevicesBuilder);
            }
            case 3 -> {
                director.contructTablet(smartDevicesBuilder);
            }
            case 4 -> {
                director.contructTV(smartDevicesBuilder);
            }
        }
        SmartDevices devices = smartDevicesBuilder.getResult();
        System.out.println(devices.toString());
        scan.close();
    }

}
