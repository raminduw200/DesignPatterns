package Creational.AbstractFactory;

import Creational.Factory.Animal;

public abstract class AnimalAbstractFactory {
    public abstract Animal getAnimal(String animalType);
}
