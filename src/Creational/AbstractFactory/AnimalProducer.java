package Creational.AbstractFactory;

import Creational.Factory.*;

public class AnimalProducer {
    public static AnimalAbstractFactory getAnimal(boolean bird) {
        System.out.println("Producing animal using AnimalAbstractFactory.");
        if (bird) return new BirdsFactory();
        else return new AnimalFactory();
    }
}
