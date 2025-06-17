package design_pattern.singleton;

public class Jalebi {

    // Eager way of creating singleton object
    private static Jalebi INSTANCE= new Jalebi();

    private Jalebi() {
        System.out.println("Singleton Jalebi initialized.");
    }

    public static Jalebi getInstance() {
        return INSTANCE;
    }
}
