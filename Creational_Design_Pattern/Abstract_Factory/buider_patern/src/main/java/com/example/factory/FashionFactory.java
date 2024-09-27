package com.example.factory;

import com.example.hats.Hats;
import com.example.shoes.Shoes;
import com.example.skirts.Skirts;

public interface FashionFactory {
    Shoes createShoes();
    Hats createHats();
    Skirts createSkirts();
}
