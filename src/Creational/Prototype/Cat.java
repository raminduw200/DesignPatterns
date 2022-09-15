package Creational.Prototype;

public class Cat extends Animal {

    public Cat(){
        type = "Cat";
        System.out.println("Cat created");
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
