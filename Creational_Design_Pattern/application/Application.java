package Creational_Design_Pattern.application;

import Creational_Design_Pattern.factories.FashionFactory;
import Creational_Design_Pattern.hats.Hats;
import Creational_Design_Pattern.shoes.Shoes;
import Creational_Design_Pattern.skirts.Skirts;

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
