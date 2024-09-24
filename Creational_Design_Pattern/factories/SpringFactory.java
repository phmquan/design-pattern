package Creational_Design_Pattern.factories;

import Creational_Design_Pattern.hats.Hats;
import Creational_Design_Pattern.hats.SpringHats;
import Creational_Design_Pattern.shoes.Shoes;
import Creational_Design_Pattern.shoes.SpringShoes;
import Creational_Design_Pattern.skirts.Skirts;
import Creational_Design_Pattern.skirts.SpringSkirts;

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
