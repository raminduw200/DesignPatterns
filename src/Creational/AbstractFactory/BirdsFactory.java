package Creational.AbstractFactory;

import Creational.Factory.*;

public class BirdsFactory extends AnimalAbstractFactory {
    @Override
    public Animal getAnimal(String bird){
        System.out.println("Calling BirdsFactory");
        if (bird == null) return null;
        else if (bird.equalsIgnoreCase("CHICKEN")) return new Chicken();
        else if (bird.equalsIgnoreCase("Parrot")) return new Parrot();
        else if (bird.equalsIgnoreCase("Duck")) return new Duck();
        return null;
    }
}
