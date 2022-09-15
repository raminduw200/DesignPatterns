package Creational.Factory;

public class Chicken implements Animal{
    public Chicken(){
        System.out.println("Chicken created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }
}
