package Creational.Factory;

public class Parrot implements Animal{
    public Parrot(){
        System.out.println("Parrot created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }
}
