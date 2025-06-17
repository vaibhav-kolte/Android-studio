package design_pattern.singleton;

public class Samosa {

    private static Samosa INSTANCE;

    private Samosa() {
        System.out.println("Singleton Samosa initialized.");
    }

    // Lazy way of creating single object
    public static Samosa getInstance() {
        if (INSTANCE == null) INSTANCE = new Samosa();
        return INSTANCE;
    }
}
