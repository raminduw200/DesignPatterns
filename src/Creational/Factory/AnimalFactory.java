package Creational.Factory;

import Creational.AbstractFactory.AnimalAbstractFactory;

public class AnimalFactory extends AnimalAbstractFactory {
    public Animal getAnimal(String animal){
        System.out.println("Calling AnimalFactory");
        if (animal == null) return null;
        else if (animal.equalsIgnoreCase("CAT")) return new Cat();
        else if (animal.equalsIgnoreCase("DOG")) return new Dog();
        else if (animal.equalsIgnoreCase("WOLF")) return new Wolf();
        return null;
    }
}
