package design_pattern.singleton;

public class Kachori {

    private static Kachori INSTANCE;

    private Kachori() {
        System.out.println("Singleton Kachori initialized.");
    }

    // Lazy way of creating single object
    public static Kachori getInstance() {
        if (INSTANCE == null) {
            synchronized (Kachori.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Kachori();
                }
            }
        }
        return INSTANCE;
    }
}
