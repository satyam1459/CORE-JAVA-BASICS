package Singelton.Singelton;

public class Main {
    public static void main(String[] args) {
        // Eager eager1 = Eager.getInstance();
        // Eager eager2 = Eager.getInstance();
        // Eager eager3 = Eager.getInstance();

        Eager eager1 = Eager.getObject();
        Eager eager2 = Eager.getObject();
        Eager eager3 = Eager.getObject();

        System.out.println(eager1);
        System.out.println(eager2);
        System.out.println(eager3);
    }
}
