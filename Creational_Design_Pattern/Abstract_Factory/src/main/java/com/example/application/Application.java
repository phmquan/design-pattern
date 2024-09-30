package com.example.application;

import com.example.factory.FashionFactory;
import com.example.hats.Hats;
import com.example.shoes.Shoes;
import com.example.skirts.Skirts;

public class Application {
    private Shoes shoes;
    private Hats hats;
    private Skirts skirts;
    public Application(FashionFactory factory) {
        shoes=factory.createShoes();
        hats=factory.createHats();
        skirts=factory.createSkirts();
    }
    public void print(){
        shoes.print();
        hats.print();
        skirts.print();
    }
}
