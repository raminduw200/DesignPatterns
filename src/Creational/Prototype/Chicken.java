package Creational.Prototype;

public class Chicken extends Animal {
    public Chicken(){
        type = "Chicken";
        System.out.println("Chicken created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }
}
