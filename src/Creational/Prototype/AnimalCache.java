package Creational.Prototype;

import java.util.Hashtable;

public class AnimalCache {
    private static Hashtable<String, Animal> animalMap = new Hashtable<String, Animal>();

    public static Animal getAnimal(String animalId) {
        Animal cachedAnimal = animalMap.get(animalId);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        Dog dog = new Dog();
        dog.setId("1");
        animalMap.put(dog.getId(), dog);

        Cat cat = new Cat();
        cat.setId("2");
        animalMap.put(cat.getId(), cat);
        
        Chicken chicken = new Chicken();
        chicken.setId("3");
        animalMap.put(chicken.getId(), chicken);
        
        Duck duck = new Duck();
        duck.setId("4");
        animalMap.put(duck.getId(), duck);
        
        Parrot parrot = new Parrot();
        parrot.setId("5");
        animalMap.put(parrot.getId(), parrot);
        
        Wolf wolf = new Wolf();
        wolf.setId("6");
        animalMap.put(wolf.getId(), wolf);
    }
}
