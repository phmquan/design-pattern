package com.example.factory;

import com.example.hats.Hats;
import com.example.hats.SummerHats;
import com.example.shoes.Shoes;
import com.example.shoes.SummerShoes;
import com.example.skirts.Skirts;
import com.example.skirts.SummerSkirts;

public class SummerFactory implements FashionFactory {
    @Override
    public Shoes createShoes(){
        return new SummerShoes();
    }
    @Override
    public Hats createHats(){
        return new SummerHats();
    }
    @Override
    public Skirts createSkirts(){
        return new SummerSkirts();
    }
}
