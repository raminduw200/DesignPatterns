package Creational.Prototype;

public class Parrot extends Animal {
    public Parrot(){
        type = "Parrot";
        System.out.println("Parrot created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }
}
