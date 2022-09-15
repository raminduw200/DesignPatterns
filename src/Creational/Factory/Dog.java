package Creational.Factory;

public class Dog implements Animal {
    public Dog(){
        System.out.println("Dog created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Bow bow");
    }
}

