package Creational.Singleton;

public class Runtime {
    private static Runtime instance = null;

    private Runtime() {
        System.out.println("Calling Runtime constructor");
    }

    public static Runtime getInstance() {
        if (instance == null) {
            instance = new Runtime();
            System.out.println("Runtime instance created");
        }
        return instance;
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getInstance();
    }
}
