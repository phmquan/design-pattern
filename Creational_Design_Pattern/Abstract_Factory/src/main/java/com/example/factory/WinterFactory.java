package com.example.factory;

import com.example.hats.Hats;
import com.example.hats.WinterHats;
import com.example.shoes.Shoes;
import com.example.shoes.WinterShoes;
import com.example.skirts.Skirts;
import com.example.skirts.WinterSkirts;

public class WinterFactory implements FashionFactory {
    @Override
    public Shoes createShoes(){
        return new WinterShoes();
    }
    @Override
    public Hats createHats(){
        return new WinterHats();
    }
    @Override
    public Skirts createSkirts(){
        return new WinterSkirts();
    }
}
