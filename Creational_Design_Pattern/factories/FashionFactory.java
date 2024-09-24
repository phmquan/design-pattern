package Creational_Design_Pattern.factories;

import Creational_Design_Pattern.hats.Hats;
import Creational_Design_Pattern.shoes.Shoes;
import Creational_Design_Pattern.skirts.Skirts;

public interface FashionFactory {
    Shoes createShoes();
    Hats createHats();
    Skirts createSkirts();
}
