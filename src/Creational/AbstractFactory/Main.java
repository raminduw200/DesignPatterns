package Creational.AbstractFactory;

import Creational.Factory.*;

public class Main {
    public static void main(String[] args) {
        AnimalProducer animalProducer = new AnimalProducer();
        AnimalAbstractFactory birdsAbsFac = animalProducer.getAnimal(true);
        Animal chicken = birdsAbsFac.getAnimal("chicken");
        System.out.println();
        Animal parrot = birdsAbsFac.getAnimal("chicken");
        System.out.println();
        Animal duck = birdsAbsFac.getAnimal("duck");
        System.out.println();

        AnimalAbstractFactory animalAbsFac = animalProducer.getAnimal(false);
        Animal cat = animalAbsFac.getAnimal("cat");
        System.out.println();
        Animal dog = animalAbsFac.getAnimal("dog");
        System.out.println();
        Animal wolf = animalAbsFac.getAnimal("wolf");
        System.out.println();
    }
}
