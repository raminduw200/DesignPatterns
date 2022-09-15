package Creational.Prototype;

public class Wolf extends Animal {
    public Wolf(){
        type = "Wolf";
        System.out.println("Wolf created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Howl howl");
    }
}