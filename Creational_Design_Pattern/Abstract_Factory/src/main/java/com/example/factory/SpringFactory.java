package com.example.factory;

import com.example.hats.Hats;
import com.example.hats.SpringHats;
import com.example.shoes.Shoes;
import com.example.shoes.SpringShoes;
import com.example.skirts.Skirts;
import com.example.skirts.SpringSkirts;

public class SpringFactory implements FashionFactory {
    @Override
    public Shoes createShoes(){
        return new SpringShoes();
    }
    @Override
    public Hats createHats(){
        return new SpringHats();
    }
    @Override
    public Skirts createSkirts(){
        return new SpringSkirts();
    }
}
