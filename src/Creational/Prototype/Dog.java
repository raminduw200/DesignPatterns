package Creational.Prototype;

public class Dog extends Animal {
    public Dog(){
        type = "Dog";
        System.out.println("Dog created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Bow bow");
    }
}

