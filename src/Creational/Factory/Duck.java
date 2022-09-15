package Creational.Factory;

public class Duck implements Animal{
    public Duck(){
        System.out.println("Duck created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
