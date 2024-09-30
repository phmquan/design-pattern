package com.example.application;

import java.util.Scanner;

import com.example.factory.FashionFactory;
import com.example.factory.SpringFactory;
import com.example.factory.SummerFactory;
import com.example.factory.WinterFactory;

public class Main {
    private static Application configureApplication(){
        Scanner scan=new Scanner(System.in);
        Application app;
        FashionFactory factory;
        System.out.println("Moi ban nhap chon kieu mua ban muon:");
        System.out.println("1.Summer");
        System.out.println("2.Winter");
        System.out.println("3.Spring");
        int input=Integer.parseInt(scan.nextLine());
        switch(input){
            case 1: factory=new SummerFactory();
            break;
            case 2: factory=new WinterFactory();
            break;
            case 3: factory=new SpringFactory();
            break;
            default: 
                System.out.println("Invalid option, defaulting to Summer");
                factory = new SummerFactory();  // Provide a default factory
                break;
        }
        app=new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app=configureApplication();
        app.print();
    }
}