package Creational.Factory;

public class Main {
    public static AnimalFactory animalFc = new AnimalFactory();
    public static void main(String[] args) {
        Animal cat = animalFc.getAnimal("cat");
        System.out.println();
        Animal dog = animalFc.getAnimal("dog");
        System.out.println();
        Animal wolf = animalFc.getAnimal("wolf");
    }
}
