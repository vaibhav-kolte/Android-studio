package design_pattern.singleton;

public class Example {
    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getInstance();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getInstance();
        System.out.println(samosa2.hashCode());


        System.out.println(Jalebi.getInstance().hashCode());
        System.out.println(Jalebi.getInstance().hashCode());


        System.out.println(Kachori.getInstance().hashCode());
        System.out.println(Kachori.getInstance().hashCode());
    }
}
