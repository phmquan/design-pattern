package Creational_Design_Pattern.factories;

import Creational_Design_Pattern.hats.Hats;
import Creational_Design_Pattern.hats.WinterHats;
import Creational_Design_Pattern.shoes.Shoes;
import Creational_Design_Pattern.shoes.WinterShoes;
import Creational_Design_Pattern.skirts.Skirts;
import Creational_Design_Pattern.skirts.WinterSkirts;

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
