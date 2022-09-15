package Creational.Prototype;

public class Duck extends Animal {
    public Duck(){
        type = "Duck";
        System.out.println("Duck created");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
