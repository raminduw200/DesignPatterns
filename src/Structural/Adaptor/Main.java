package Structural.Adaptor;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        System.out.println("Actual Bird: ");
        bird.fly();
        bird.makeSound();

        System.out.println();

        ToyDuck toyDuck = new PlasticToyDuck();
        System.out.println("Toy Duck: ");
        toyDuck.squeak();

        System.out.println();

        ToyDuck birdAdapter = new BirdAdapter(bird);
        System.out.println("BirdAdapter: ");
        birdAdapter.squeak();
    }
}
