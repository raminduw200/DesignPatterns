package Creational.Factory;

public class Wolf implements Animal {
    public Wolf(){
        System.out.println("Wolf created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Howl howl");
    }
}