package Creational_Design_Pattern.factories;

import Creational_Design_Pattern.hats.Hats;
import Creational_Design_Pattern.hats.SummerHats;
import Creational_Design_Pattern.shoes.Shoes;
import Creational_Design_Pattern.shoes.SummerShoes;
import Creational_Design_Pattern.skirts.Skirts;
import Creational_Design_Pattern.skirts.SummerSkirts;

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
