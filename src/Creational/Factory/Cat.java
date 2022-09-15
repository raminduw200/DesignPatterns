package Creational.Factory;

public class Cat implements Animal {

    public Cat(){
        System.out.println("Cat created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
